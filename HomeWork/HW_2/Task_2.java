// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.
package HomeWork.HW_2;
import java.io.IOException;
import java.util.logging.*;

public class Task_2 {

    static class ArrayBubble
    {
        private long[] a;   
        private int elems;  
    
        public ArrayBubble(int max)
        {    
            a = new long[max];         
            elems = 0;                  
        }
    
        public void into(long value)
        {   
            a[elems] = value;           
            elems++;                  
        }
    
        public void printer()
        {          
            for (int i = 0; i < elems; i++)
            {    
                System.out.print(a[i] + " ");   
                System.out.println("");       
            }
        }
    
        private void toSwap(int first, int second)
        { 
            long dummy = a[first];      
            a[first] = a[second];       
            a[second] = dummy;          
        }
    
        public void bubbleSorter()
        {     
            for (int out = elems - 1; out >= 1; out--)
            { 
                for (int in = 0; in < out; in++)
                {       
                    if(a[in] > a[in + 1])               
                        toSwap(in, in + 1);             
                }
            }
        }
    }
    
    public static void main(String[] args) throws SecurityException, IOException {
    Logger logger = Logger.getLogger(Task_2.class.getName());
    FileHandler fh = new FileHandler("log.xml");
    logger.addHandler(fh);
    XMLFormatter xml = new XMLFormatter();
    fh.setFormatter(xml);
        ArrayBubble array = new ArrayBubble(5);
        logger.info("Create Object ArrayBubble");
        array.into(163);
        logger.info("Add element 163");       
        array.into(300);
        logger.info("Add element 300");       
        array.into(184);
        logger.info("Add element 184");
        array.into(191);
        logger.info("Add element 191");
        array.into(174);
        logger.info("Add element 174");
        array.printer();
        logger.info("Print array");            
        array.bubbleSorter();
        logger.info("Make a bubble sort to the initial array");       
        array.printer(); 
        logger.info("Print array"); 
    }
}
