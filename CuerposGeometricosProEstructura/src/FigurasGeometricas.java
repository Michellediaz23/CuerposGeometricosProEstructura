import java.util.Scanner;

public class FigurasGeometricas {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Selecciona una figura geométrica:");
            System.out.println("1. Cilindro");
            System.out.println("2. Cono");
            System.out.println("3. Dodecaedro");
            System.out.println("4. Esfera");
            System.out.println("5. Hexaedro");
            System.out.println("6. Icosaedro");
            System.out.println("7. Pirámide");
            System.out.println("8. Prisma");
            System.out.println("9. Tetraedro");
            System.out.println("10. Tronco de pirámide");
            System.out.println("11. Tronco de cono");
            System.out.println("12. Octaedro");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            if (lector.hasNextInt()) {
                opcion = lector.nextInt();
                lector.nextLine();
                if (opcion >= 0 && opcion <= 12) {

                    double areaBase;
                    switch (opcion) {
                        case 1:
                            double areaLateral, areaTotal, volumen;

                            System.out.print("Ingrese la altura del cilindro: ");
                            double altura = lector.nextDouble();

                            System.out.print("Ingrese el radio del cilindro: ");
                            double radio = lector.nextDouble();

                            areaLateral = 2 * Math.PI * radio * altura;
                            areaTotal = 2 * Math.PI * radio * (altura + radio);
                            volumen = Math.PI * Math.pow(radio, 2) * altura;

                            System.out.println("El área lateral del cilindro es: " + areaLateral);
                            System.out.println("El área total del cilindro es: " + areaTotal);
                            System.out.println("El volumen del cilindro es: " + volumen);
                            break;
                        case 2:
                            double areaDeBase;

                            System.out.print("Inserte la generatriz del cono: ");
                            double generatriz = lector.nextDouble();

                            System.out.print("Inserte la altura del cono: ");
                            altura = lector.nextDouble();

                            System.out.print("Inserte el radio del cono: ");
                            radio = lector.nextDouble();

                            areaLateral = Math.PI * radio * generatriz;
                            areaTotal = Math.PI * radio * (generatriz + radio);
                            areaDeBase = Math.PI * Math.pow(radio, 2);
                            volumen = areaDeBase * altura / 3;

                            System.out.println("El área lateral del cono es: " + areaLateral);
                            System.out.println("El área total del cono es: " + areaTotal);
                            System.out.println("El área de la base del cono es: " + areaDeBase);
                            System.out.println("El volumen del cono es: " + volumen);
                            break;
                        case 3:
                            double arista;

                            System.out.print("Ingrese la arista: ");
                            arista = lector.nextDouble();

                            double area = -3 * (arista * 2) * (25 + 10 * 5);
                            double volumenn = -(15 + 7 * 5 / 4 * (arista * 3));

                            System.out.println("Área: " + area + " unidades cuadradas.");
                            System.out.println("Volumen: " + volumenn + " unidades cúbicas.");
                            break;
                        case 4:
                            double radi;

                            System.out.print("Insertar el radio de la esfera: ");
                            radi = lector.nextDouble();

                            double areaa = 4 * Math.PI * Math.pow(radi, 2);
                            double volumenV = (4.0 / 3.0) * Math.PI * Math.pow(radi, 3);

                            System.out.println("El área de la esfera es: " + areaa);
                            System.out.println("El volumen de la esfera es: " + volumenV);
                            break;
                        case 5:
                            double aristaHexaedro;

                            System.out.print("Inserte la arista: ");
                            aristaHexaedro = lector.nextDouble();

                            double areaHexaedro = 2 * Math.pow(aristaHexaedro, 2) * Math.sqrt(3);
                            double volumenHexaedro = Math.sqrt(2) * Math.pow(aristaHexaedro, 3) / 3;

                            System.out.println("El área del hexaedro es: " + areaHexaedro);
                            System.out.println("El volumen del hexaedro es: " + volumenHexaedro);
                            break;
                        case 6:
                            double aristaIcosaedro;

                            System.out.print("Inserte la arista: ");
                            aristaIcosaedro = lector.nextDouble();

                            double areaIcosaedro = 5 * aristaIcosaedro * aristaIcosaedro * Math.sin(Math.toRadians(60));
                            double volumenIcosaedro = 0.417 * (3 + 2.24) * aristaIcosaedro * aristaIcosaedro * aristaIcosaedro;

                            System.out.println("El área del icosaedro es: " + areaIcosaedro);
                            System.out.println("El volumen del icosaedro es: " + volumenIcosaedro);
                            break;
                        case 7:
                            double ladoPiramide, apotemaPiramide, alturaPiramide, areaBasePiramide;

                            System.out.println("Ingresa el lado de la pirámide: ");
                            ladoPiramide = lector.nextDouble();

                            System.out.println("Calcula la apotema de la pirámide: ");
                            apotemaPiramide = lector.nextDouble();System.out.println("Ingresa la altura de la pirámide: ");
                            alturaPiramide = lector.nextDouble();

                            areaBasePiramide = ladoPiramide * ladoPiramide;
                            double areaLateralPiramide = (ladoPiramide * apotemaPiramide) / 2;
                            double areaTotalPiramide = areaBasePiramide + (4 * areaLateralPiramide);
                            double volumenPiramide = (areaBasePiramide * alturaPiramide) / 3;

                            System.out.println("Área Lateral: " + areaLateralPiramide);
                            System.out.println("Área de la Base: " + areaBasePiramide);
                            System.out.println("Área Total: " + areaTotalPiramide);
                            System.out.println("Volumen: " + volumenPiramide);
                            break;
                        case 8:
                            int cantidadLadosPrisma;
                            double alturaPrisma, longitudLadosPrisma, perimetroBasePrisma, apotemaPrisma;

                            System.out.print("Cantidad de lados del prisma: ");
                            cantidadLadosPrisma = lector.nextInt();

                            System.out.print("Altura del prisma: ");
                            alturaPrisma = lector.nextDouble();

                            System.out.print("Longitud de los lados de la base: ");
                            longitudLadosPrisma = lector.nextDouble();

                            perimetroBasePrisma = cantidadLadosPrisma * longitudLadosPrisma;
                            double areaLateralPrisma = perimetroBasePrisma * alturaPrisma;
                            double alfaPrisma = (Math.PI / 180) * (360 / cantidadLadosPrisma);
                            apotemaPrisma = longitudLadosPrisma / (2 * Math.tan((alfaPrisma) / 2));
                            double areaBasePrisma = (perimetroBasePrisma * apotemaPrisma) / 2;
                            double areaTotalPrisma = areaLateralPrisma + (2 * areaBasePrisma);
                            double volumenPrisma = areaBasePrisma * alturaPrisma;

                            System.out.println("Área Lateral: " + areaLateralPrisma + " unidades cuadradas.");
                            System.out.println("Área Total: " + areaTotalPrisma + " unidades cuadradas.");
                            System.out.println("Volumen: " + volumenPrisma + " unidades cúbicas.");
                            break;
                        case 9:
                            double aristaTetraedro, areaDeBaseTetraedro, areaTotalTetraedro, volumenTetraedro, alturaTetraedro;

                            System.out.print("Ingrese la longitud de la arista del tetraedro: ");
                            aristaTetraedro = lector.nextDouble();

                            areaDeBaseTetraedro = (3 * Math.sqrt(3) * Math.pow(aristaTetraedro, 2)) / 4;
                            areaTotalTetraedro = areaDeBaseTetraedro * 4;

                            volumenTetraedro = (Math.sqrt(2) * Math.pow(aristaTetraedro, 3)) / 12;
                            alturaTetraedro = (Math.sqrt(6) * aristaTetraedro) / 3;

                            System.out.println("El área del tetraedro es: " + areaDeBaseTetraedro);
                            System.out.println("El área total del tetraedro es: " + areaTotalTetraedro);
                            System.out.println("El volumen del tetraedro es: " + volumenTetraedro);
                            System.out.println("La altura del tetraedro es: " + alturaTetraedro);
                            break;
                        case 10:
                        

                          System.out.println("Ingrese el área de la base superior (A):");
                           double A = lector.nextDouble();

                           System.out.println("Ingrese el área de la base inferior (a):");
                            double a = lector.nextDouble();

                          System.out.println("Ingrese la altura (h):");
                         double h = lector.nextDouble();

                         double volume = (1.0/3.0) * h * (A + a + Math.sqrt(A * a));

                   System.out.println("El volumen del tronco de pirámide es: " + volume);


                        break;
                        case 11:
                            double rMayor, rMenorTronco, altTronco, generatrizTronco, areaLateralTronco, areaTotalTronco, volumenTronco;

                            System.out.println("Ingrese el radio mayor del tronco de cono: ");
                            rMayor = lector.nextDouble();

                            System.out.println("Ingrese el radio menor del tronco de cono: ");
                            rMenorTronco = lector.nextDouble();

                            System.out.println("Ingrese la altura del tronco de cono: ");
                            altTronco = lector.nextDouble();
                            generatrizTronco = Math.sqrt(Math.pow(rMayor, 2) + Math.pow(altTronco, 2));
                            areaLateralTronco = Math.PI * (rMayor + rMenorTronco) * generatrizTronco;
                            areaBase = Math.PI * Math.pow(rMayor, 2);
                            areaTotalTronco = areaBase + areaLateralTronco;
                            volumenTronco = (Math.PI * altTronco * (Math.pow(rMayor, 2) + rMayor * rMenorTronco + Math.pow(rMenorTronco, 2))) / 3;

                            System.out.println("Área Lateral: " + areaLateralTronco);
                            System.out.println("Área Total: " + areaTotalTronco);

                            System.out.println("Volumen: " + volumenTronco);
                            break;
                        case 12:
                            double aristaOctaedro, areaOctaedro, volumenOctaedro;

                            System.out.print("Inserte la arista del octaedro: ");
                            aristaOctaedro = lector.nextDouble();

                            areaOctaedro = 2 * Math.sqrt(3) * Math.pow(aristaOctaedro, 2);
                            volumenOctaedro = (Math.sqrt(2) / 3) * Math.pow(aristaOctaedro, 3);

                            System.out.println("El área del octaedro es: " + areaOctaedro);
                            System.out.println("El volumen del octaedro es: " + volumenOctaedro);
                            break;
                        case 0:
                            System.out.println("Saliendo del programa.");
                            break;
                    }
                } else {
                    System.out.println("Opción no válida. Introduce una opción entre 0 y 12.");
                }
            } else {
                System.out.println("Entrada no válida. Introduce un número entero.");
                lector.nextLine(); 
                opcion = -1; 
            }
        } while (opcion != 0);

        lector.close();
    }

    
    }




