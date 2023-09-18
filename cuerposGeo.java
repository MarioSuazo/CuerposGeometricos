import java.util.Scanner;

public class cuerposGeo {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        
        byte op;
        int cantidadLados;
        double longitudLados, altura, areaL, areaT, volumen;
        double Pbase, Abase, apotema, radio;
        double APiramide, Apir, area;
        double anchoL, generatriz, radioMayor, radioMenor;
        double AbaseMenor, ABaseMayor, ABase, PBase, longMayor;
        double longMenor, longMayor_Mitad, noGrados, arista, diagonal;
        double base, Pent, apotemaPent, areaPent;
        



        do{
            System.out.println("\n\t* Calculador de Cuerpos Geometricos *");
            System.out.println("1. Prisma  \t\t\t2. Cilindro \t\t3. Pirámide");
            System.out.println("4. Cono \t\t\t5. Esfera \t\t6. Zona Esférica");
            System.out.println("7. Casquete Esférico \t\t8. Tronco de Cono \t9. Tronco de Pirámide");
            System.out.println("10. Huso y Cuña Esférica \t11. Tetraedro \t\t12. Hexaedro");
            System.out.println("13. Octaedro \t\t\t14. Dodecaedro \t\t15. Icosaedro");
            System.out.println("16. Ortoedro \t\t\t\t17. Finalizar");
            System.out.print("\nElija un Cuerpo a Calcular:  ");
            op=lector.nextByte();

            switch(op){
                case 1:
                    System.out.println("Prisma.");
                    System.out.println("Ingresar la cantidad de lados: ");
                    cantidadLados = lector.nextInt();
            
                    System.out.println("Ingresar la longitud de un lado: ");
                    longitudLados = lector.nextDouble();
            
                    System.out.println("Ingresar la altura: ");
                    altura = lector.nextDouble();
            
                    Pbase = cantidadLados * longitudLados;
                    areaL = Pbase * altura;
                    Double alfa = (Math.PI/180) * (380/cantidadLados);
                    apotema =  longitudLados / (2 * Math.tan((alfa)/2));
                    Abase = (Pbase * apotema)/2;
                    areaT = areaL + 2 * Abase;  
                    volumen = Abase * altura; 
                    
                    System.out.println("El Area lateral es: " + areaL );
                    System.out.println("El Area Total es: " + areaT );
                    System.out.println("El Volumen es: " + volumen );                        
                break;
            
                case 2:
                    System.out.println("Digitar el radio: ");
                    radio = lector.nextDouble();
            
                    System.out.println("Digitar la altura: ");
                    altura = lector.nextDouble();
            
                    Pbase = (2* Math.PI) * radio;
                    areaL = Pbase * altura;
                    Abase = Math.PI * Math.pow(radio, 2);
                    areaT = areaL + (2 * Abase);
                    volumen = Abase * altura;
            
                    System.out.println("El Area lateral es: " + areaL );
                    System.out.println("El Area Total es: " + areaT );
                    System.out.println("El Volumen es: " + volumen );                    
                break;

                case 3:
                    System.out.println("Piramide.");
                    System.out.println("Ingresar la altura: ");
                    altura = lector.nextDouble();
            
                    System.out.println("Ingresar la longitud de los lados: ");
                    longitudLados = lector.nextDouble();
            
                    System.out.println("Ingresar el ancho de los lados: ");
                    anchoL = lector.nextDouble();
            
                    Pbase = 2 * longitudLados + 2 * anchoL;
                    apotema = longitudLados/2;
                    APiramide = Math.sqrt(Math.pow(altura, 2) + Math.pow(apotema, 2));
                    areaL = (Pbase * APiramide)/2;
                    areaT = areaL + Pbase;
                    Abase = longitudLados/2;
                    volumen = (Abase* altura)/3;
            
                    System.out.println("El Area lateral es: " + areaL );
                    System.out.println("El Area total es: " + areaT );
                    System.out.println("El Volumen es: " + volumen );
                break;

                case 4:
                    System.out.println("Cono.");
                    System.out.println("Digitar la altura: ");
                    altura = lector.nextDouble();
            
                    System.out.println("Digitar el radio: ");
                    radio = lector.nextDouble();
            
                    generatriz = Math.sqrt(Math.pow(altura, 2) + Math.pow(radio, 2));
                    areaL = Math.PI * radio * generatriz;
                    Abase = Math.PI * (radio * radio);
                    areaT = areaL + Abase;
                    volumen = (Abase + areaL) /3;
            
                    System.out.println("El Area lateral es: " + areaL );
                    System.out.println("El Area total es: " + areaT );
                    System.out.println("El Volumen es: " + volumen );
                break;

                case 5:
                    System.out.println("Esfera.");
                    System.out.println("Ingresar el radio: ");
                    radio = lector.nextDouble();
            
                    area = 4 * Math.PI * Math.pow(radio, 2);
                    volumen = (4/3) * Math.PI * Math.pow(area, 3);
            
                    System.out.println("El Area es: " + area);
                    System.out.println("El Volumen es: " + volumen);
                break;

                case 6:
                    System.out.println("Zona Esferica.");
                    System.out.println("Digitar el radio: ");
                    radio = lector.nextDouble();
            
                    System.out.println("Digitar la altura ");
                    altura = lector.nextDouble();
            
                    System.out.println("Digitar el radio mayor: ");
                    radioMayor = lector.nextDouble();
            
                    area = 2 * Math.PI *  radioMayor * altura;
                    volumen = (Math.PI * altura * (Math.pow(altura, 2) + 3*Math.pow(radio, 2) + 3*Math.pow(radioMayor, 2)))/6;
            
            
                    System.out.println("El Area es: " + area);
                    System.out.println("El Volumen es: " + volumen);
                break;

                case 7:
                    System.out.println("Casquete Esferico.");
                    System.out.println("Ingresar la altura ");
                    altura = lector.nextDouble();
            
                    System.out.println("Ingresar el radio mayor: ");
                    radioMayor = lector.nextDouble();
            
                    area = 2 * Math.PI *  radioMayor * altura;
                    volumen = (Math.PI * Math.pow(altura, 2) * (3*radioMayor - altura))/6;
            
            
                    System.out.println("El Area es: " + area);
                    System.out.println("El Volumen es: " + volumen);
                break;

                case 8:
                    System.out.println("Tronco de Cono.");
                    System.out.println("Digitar la altura: ");
                    altura = lector.nextDouble();
            
                    System.out.println("Digitar el radio menor: ");
                    radioMenor = lector.nextDouble();
            
                    System.out.println("Digitar el Radio mayor: ");
                    radioMayor = lector.nextDouble();
            
                    generatriz = Math.sqrt(Math.pow(altura, 2) + (Math.pow(radioMayor - radioMenor, 2)));
                    ABase = Math.PI * Math.pow(radioMayor, 2);
                    Abase = Math.PI * Math.pow(radioMenor, 2);
                    areaL = Math.PI * generatriz * (radioMayor + radioMenor);
                    areaT = areaL + ABase + Abase;
                    volumen = (1/3) * Math.PI * altura * (Math.pow(radioMayor, 2) + Math.pow(radioMenor, 2) + (radioMayor * radioMenor));
            
            
                    System.out.println("El Area lateral es: " + areaL );
                    System.out.println("El Area total es: " + areaT );
                    System.out.println("El Volumen es: " + volumen );
                break;

                case 9:
                    System.out.println("");
                    System.out.println("Ingresar la longitd del lado mayor: ");
                    longMayor = lector.nextDouble();
            
                    System.out.println("Ingresar la longitud del lado menor: ");
                    longMenor = lector.nextDouble();
            
                    System.out.println("Ingresar la altura: ");
                    altura = lector.nextDouble();
            
                    longMayor_Mitad = longMayor / 2;
                    Apir = (Math.sqrt(Math.pow(altura, 2)) + (Math.pow(longMayor_Mitad, 2)));
                    ABase = Math.pow(longMayor, 2);
                    Abase = Math.pow(longMenor, 2);
                    PBase = longMayor * 4;
                    Pbase = longMenor * 4;
                    areaL = ((PBase + Pbase)/2) * Apir;
                    areaT = areaL + ABase + Abase;
                    volumen = ((1/3) * altura * (ABase + Abase + Math.sqrt(ABase * Abase)));
            
                    System.out.println("El Area lateral es: " + areaL );
                    System.out.println("El Area total es: " + areaT );
                    System.out.println("El Volumen es: " + volumen );
                break;

                case 10:
                    System.out.println("Huso y Cuña Esferico.");
                    System.out.println("Digitar el radio: ");
                    radio = lector.nextDouble();
            
                    System.out.println("Digitar el numero de grados: ");
                    noGrados = lector.nextDouble();
            
                    area = (4 * Math.PI * Math.pow(radio, 2) * noGrados)/360;
                    volumen = (4/3) * ((Math.PI * Math.pow(radio, 3) * noGrados)/360);
            
                    System.out.println("El Area es: " + area);
                    System.out.println("El Volumen es: " + volumen);
                break;

                case 11:
                    System.out.println("Tetraedro.");
                    System.out.println("Ingresar un arista: ");
                    arista = lector.nextDouble();
            
                    area = Math.pow(arista, 3) * Math.sqrt(3) ;
                    volumen = (Math.sqrt(2)/12) * arista;
                    altura = arista * (Math.sqrt(6)/3);
            
                    System.out.println("El Area es: " + area);
                    System.out.println("El Volumen es: " + volumen);
                    System.out.println("El Altura es: " + altura);
                break;

                case 12:
                    System.out.println("Hexaedro.");
                    System.out.println("Digitar un arista: ");
                    arista = lector.nextDouble();
            
                    area = 6 * Math.pow(arista, 2);
                    diagonal = arista * Math.sqrt(3);
                    volumen = Math.pow(arista, 3);
            
                    System.out.println("El Area es: " + area);
                    System.out.println("El Diagonal es: " + diagonal);
                    System.out.println("El Volumen es: " + volumen);
                break;

                case 13:
                    System.out.println("Octaedro.");
                    System.out.println("Ingresar un arista: ");
                    arista = lector.nextDouble();
            
                    area = 2 * Math.pow(arista, 2) * Math.sqrt(3);
                    volumen = (Math.sqrt(2)/3) * Math.pow(arista, 3);
            
                    System.out.println("El Area es: " + area);
                    System.out.println("El Volumen es: " + volumen);
                break;

                case 14:
                    System.out.println("Dodecaedro.");
                    System.out.println("Digitar un arista: ");
                    arista = lector.nextDouble();
            
                    apotemaPent = arista / (2 * Math.tan(36));
                    areaPent = (5/2) * arista * apotemaPent;
                    area = 3 * Math.pow(arista, 2) * Math.sqrt(25 + 10 + Math.sqrt(5));
                    volumen = (1/4) * (15 + 7 * Math.sqrt(5)) * Math.pow(arista, 3);
                    
                    System.out.println("El Area del Pentagono es: "+ apotemaPent);
                    System.out.println("El Area es: " + area);
                    System.out.println("El Volumen es: " + volumen);
                break;

                case 15:
                    System.out.println("Icosaedro.");
                    System.out.println("Ingresar un arista: ");
                    arista = lector.nextDouble();
            
                    area = 5 * Math.pow(arista, 2) * Math.sqrt(3);
                    volumen = (5/12) * (3 + Math.sqrt(5)) * Math.pow(arista, 3);
            
                    System.out.println("El Area es: " + area);
                    System.out.println("El Volumen es: " + volumen);
                break;

                case 16:
                    System.out.println("Ortoedro.");
                    System.out.println("Digitar la altura");
                    altura =  lector.nextDouble();
            
                    System.out.println("Digitar la base: ");
                    base = lector.nextDouble();
            
                    System.out.println("Digitar la arista: ");
                    arista = lector.nextDouble();
            
                    area = 2 * (arista * base + arista * altura + base * altura);
                    diagonal = Math.sqrt(Math.pow(arista, 2) + Math.pow(base, 2) + Math.pow(altura, 2));
                    volumen = arista * base * altura;
            
                    System.out.println("El Area es: " + area);
                    System.out.println("El Diagonal es: " + diagonal);
                    System.out.println("El Volumen es: " + volumen);
                break;

                case 17:
                    System.out.println("\nGracias Por Su Tiempo.\n");
                break;


            }
        }while (op != 17);
        
    

        lector.close();
    }
    /* Ing. Mario Mena. */
}