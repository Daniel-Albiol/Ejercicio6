import java.io.*;
import java.util.*;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

                        Set<Curso> socios = new HashMap<>();

                        try ( ObjectInputStream in = new ObjectInputStream(
                                new FileInputStream("cursos.dat"))) {
                            socios = (HashMap<Curso>) in.readObject();
                        } catch (IOException ex) {
                            System.out.println("Lista de cursos vacía");
                        } catch (ClassNotFoundException ex) {
                            System.out.println(ex);
                        }


                        int opcion;
                        do {
                            System.out.println("1.Cursos + 5h");
                            System.out.println("2.Cursos - 2 h");
                            System.out.println("3.Título + 50 videos");
                            System.out.println("4.Duración total");
                            System.out.println("5.Cursos superran promedio.");
                            System.out.println("6.Duración - 500 alumnos");
                            System.out.println("7.Mayor duración");
                            System.out.println("8.Salir");
                            System.out.print("\nIntroducir opción: ");
                            opcion = new Scanner(System.in).nextInt();
                            switch (opcion) {
                                case 1 -> {
                                    System.out.print("+ 5h ");
                                    String cursos = new Scanner(System.in).next();
                                    if(c1.duracion >= 5.0f){
                                        System.out.println(c1.titulo);
                                    }
                                }
                                case 2 -> {
                                    System.out.print("cursos - 2h");
                                    String dni = new Scanner(System.in).next();
                                    if(c1.duracion < 2.0f){
                                        System.out.println(c1.titulo);
                                    }
                                }
                                case 3 -> {
                                    System.out.print("título + 50 videos");
                                    if(Curso.videos >= 50){
                                        System.out.println(c1.titulo);
                                    }
                                }
                                case 4 -> {
                                    System.out.println("duracion total");
                                    System.out.println(c1.duracion);
                                }
                                case 5 -> {
                                    System.out.println("cursos superan promedio");
                                    if(){}

                                }
                                case 6 -> {
                                    System.out.println("cursos - 500 alumnos");
                                    if(c1.alumnos < 500){
                                        System.out.println(c1.titulo);
                                    }

                                }
                                case 7 -> {
                                    System.out.println("cursos mayor duración");
                                    float mayorduracion = c1.duracion;
                                    if(c1.curacion){
                                        System.out.println(c1.titulo);
                                    }

                                }
                            }
                        } while (opcion != 8);
                        try ( ObjectOutputStream out = new ObjectOutputStream(
                                new FileOutputStream("socios.dat"))) {
                            out.writeObject(socios);
                        } catch (IOException ex) {
                            System.out.println(ex);
                        }
                    }





