package septiembre;


import java.util.Scanner;

public class conversorInformaticoBytes {
    
    

    public static void main(String[] args) {
        /*
         *     Crear un conversor de unidades informáticas. El programa debe pedir la entrada por teclado de la cantidad y luego de la unidad origen:

            0 = byte
            1 = Kilobyte
            2 = Megabyte
            3 = Gigabyte
            4 = Terabyte

         * */
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce valor a convertir");
        int userBytes = input.nextInt();
        System.out.println("Ha introducido " + userBytes );
        
        System.out.println("Selecciona tipo unidad que deseas convertir:\n0. bytes\n1. Kilobytes\n 2. Megabyte\n3. Gigabyte\n4. Terabyte ");
        int opc = input.nextInt();
        System.out.println("Ha elegido la opción" + opc + "\n");
        
        int by;
        int kb;
        int mb;
        int gb;
        int tb;
        
        
        String sOpc;
        
        switch(opc) {    
        case 0 :         sOpc = " bytes";
                        
                        by = userBytes;
                        kb = by /1024;
                        mb=kb/1024;
                        gb=mb/1024;
                        tb=gb/1024;
                        
                        
            System.out.println(userBytes + " " + sOpc + " son:\n\n"+ kb + " kb\n" + mb + "Mb\n" + gb + " Gb\n" + tb + " Tb");
            break;
            
            
        case 1 :  sOpc = " Kilobytes";
        
        by = userBytes * 1024;
        kb = userBytes;
        mb=kb/1024;
        gb=mb/1024;
        tb=gb/1024;
        
System.out.println(userBytes + " " + sOpc + " son:\n\n"+ kb + " kb\n" + mb + "Mb\n" + gb + " Gb\n" + tb + " Tb");
break;   
        case 2 :  sOpc = " Megabytes";
        
        by = userBytes * 1024 * 1024;
        kb = userBytes *1024;
        mb= userBytes;
        gb=mb/1024;
        tb=gb/1024;
        
System.out.println(userBytes + " " + sOpc + " son:\n\n"+ kb + " kb\n" + mb + "Mb\n" + gb + " Gb\n" + tb + " Tb");
break;
        case 3 :  sOpc = " GigaBytes";
        
        by = userBytes* 1024* 1024 * 1024 ;
        kb = userBytes* 1024* 1024;
        mb=userBytes* 1024;
        gb= userBytes;
        tb=gb/1024;
        
        
System.out.println(userBytes + " " + sOpc + " son:\n\n"+ kb + " kb\n" + mb + "Mb\n" + gb + " Gb\n" + tb + " Tb");
break;
        case 4 :  sOpc = " TeraBytes";
        
        by = userBytes* 1024 * 1024 * 1024 * 1024 * 1024 ;
        kb = userBytes* 1024 * 1024 * 1024 * 1024 ;
        mb=userBytes* 1024 * 1024 * 1024 ;
        gb=userBytes * 1024 * 1024 ;
        tb=userBytes* 1024 ;
        
        
System.out.println(userBytes + " " + sOpc + " son:\n\n"+ kb + " kb\n" + mb + "Mb\n" + gb + " Gb\n" + tb + " Tb");
break;
        }
        input.close();
        
        
        
        

    }

}
