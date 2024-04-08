package lab3;


public class ScannerException extends Exception {
    
    public ScannerException (String str) {
        
        super(str);
    }
    
    void CheckInputValues (Double a, Double b, Double h) throws ScannerException {
        
       
            
          if ((a>=0.000001 && a<=1000000) && (b>=0.000001 && b<=1000000) && (h>=0.000001 && h<=1000000))  {
             
              System.out.println("Check #1 passed!");
              
          }
            
            else {
              
                System.out.println("Check #1 failed!");
                System.out.println("-----------------------------");
                throw new ScannerException("Что-то пошло не так... Вы вышли за диапазон (0.000001 - 1000000)");
                
            }
      
    }
    void CheckUpDowmLimits (Double a, Double b) throws ScannerException {
       
        if (b<=a) {
           
            System.out.println("Check #2 failed!");
            System.out.println("-----------------------------");
            throw new ScannerException("Верхняя граница не может меньше нижней!");
            
        }
        else {
             System.out.println("Check #2 passed!");
        }
    }
    
    void CheckStepLimits (Double a, Double b, Double h) throws ScannerException {
       
        if ((b-a)<h) {
           
            System.out.println("Check #3 failed!");
            System.out.println("-----------------------------");
            throw new ScannerException("Шаг интегрирования не может быть больше интервала !");
            
        }
        else {
             System.out.println("Check #3 passed!");
             System.out.println("\n-----------------------------");
        }
    }
    
    void CheckBeforeDelete (int index) throws ScannerException {
        if (index == -1) {
            throw new ScannerException("Выберите строку для удаления и повторите попытку!");
        }
        
        else {
            System.out.println("The line has been successfully deleted!");
        }
        
    }
    
    void CheckBeforeGettingResult (int index) throws ScannerException {
        
        if (index == -1) {
            throw new ScannerException("Выберите строку для вычисления");
        }
        
        else {
            System.out.println("The result is received!");
        }
    }
}
