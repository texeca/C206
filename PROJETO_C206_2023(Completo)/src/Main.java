import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        ArrayList<Aviao> avioes = new ArrayList<>();
        ArrayList<Carro> carros = new ArrayList<>();
        HashMap<Aviao, Carro> veiculos = new HashMap<Aviao,Carro>();


        Arquivo arq = new Arquivo();


        int opcao = 0;
        boolean controle = true;
        int tipo = 0;
        String auxAnfibio = null;
        String auxConvercivel = null;
        String idMudar = null;
        String idDeletar = null;
        String escolha = null;
        int escolha2 = 0;
        String escolha3 = null;


        while (controle) {
            System.out.println("****************************************");
            System.out.println("****************************************");
            System.out.println("********* Menu da Concessionária *******");
            System.out.println("****************************************");
            System.out.println("****************************************");
            System.out.println();
            System.out.println("Escolha uma opcao: ");
            System.out.println("1 - Adicionar veiculo");
            System.out.println("2 - Mostrar infos dos veiculos");
            System.out.println("3 - Atualzar infos dos veiculos (Incompleto)");
            System.out.println("4 - Escolher acao ");
            System.out.println("5 - Deletar veiculo (Incompleto)");
            System.out.println("0 - Sair");


            System.out.println("Entre com uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpando o buffer

            switch (opcao) {
                case 1:

                    System.out.println("Entre com o numero do tipo de veiculo (1 - aviao / 2 - carro");
                    tipo = sc.nextInt();
                    sc.nextLine();
                    if (tipo == 1) {

                        Aviao aviao = new Aviao();

                        // Preenchendo as informações
                        System.out.println("Entre com o id do veiculo: ");
                        aviao.setId(sc.nextLine());
                        System.out.println("Entre com a marca do veiculo: ");
                        aviao.setMarca(sc.nextLine());
                        System.out.println("Entre com o modelo do veiculo: ");
                        aviao.setModelo(sc.nextLine());
                        System.out.println("Entre com o ano do veiculo: ");
                        aviao.setAno(sc.nextInt());
                        sc.nextLine();
                        System.out.println("Entre com a potencia do veiculo: ");
                        aviao.setPotencia(sc.nextFloat());
                        sc.nextLine();
                        System.out.println("Entre com o numero de lugares: ");
                        aviao.setNumLugares(sc.nextInt());
                        sc.nextLine();
                        System.out.println("Entre com o tipo da motorizacao: ");
                        aviao.setTipoMotor(sc.nextLine());
                        System.out.println("O aviao é anfibio ?");
                        aviao.setAnfibio(sc.nextLine());

                        //Adicionando o objeto no array
                        avioes.add(aviao);

                        //Adicionando o objeto no arquivo
                        arq.escreverAviao(aviao);

                    } else if (tipo == 2) {
                        Carro carro = new Carro();

                        System.out.println("Entre com o id do veiculo: ");
                        carro.setId(sc.nextLine());
                        System.out.println("Entre com a marca do veiculo: ");
                        carro.setMarca(sc.nextLine());
                        System.out.println("Entre com o modelo do veiculo: ");
                        carro.setModelo(sc.nextLine());
                        System.out.println("Entre com o ano do veiculo: ");
                        carro.setAno(sc.nextInt());
                        sc.nextLine();
                        System.out.println("Entre com a potencia do veiculo: ");
                        carro.setPotencia(sc.nextFloat());
                        sc.nextLine();
                        System.out.println("Entre com o numero de lugares: ");
                        carro.setNumLugares(sc.nextInt());
                        sc.nextLine();
                        System.out.println("Entre com o tipo da carroceria: ");
                        carro.setTipoCarroceria(sc.nextLine());
                        System.out.println("O carro é convercivel ?");
                        carro.setConvercivel(sc.nextLine());

                        //Adicionando o objeto no array
                        carros.add(carro);
                        //Adicionando o objeto no arquivo

                        arq.escreverCarro(carro);
                    }

                    break;
//----------------------------------------------------------------------------------------------------------

                case 2:

                    System.out.println("----------------------------------------");
                    System.out.println("----------------------------------------");
                    System.out.println("----------- Lista de Veiculos ----------");
                    System.out.println("----------------------------------------");
                    System.out.println("----------------------------------------");


                    ArrayList<Aviao> aviaoLido = arq.lerAviao();
                    for (int i = 0; i < avioes.size(); i++) {
                        System.out.println("ID: " + aviaoLido.get(i).getId());
                        System.out.println("Marca: " + aviaoLido.get(i).getMarca());
                        System.out.println("Modelo: " + aviaoLido.get(i).getModelo());
                        System.out.println("Ano: " + aviaoLido.get(i).getAno());
                        System.out.println("Potencia: " + aviaoLido.get(i).getPotencia() + " HP");
                        System.out.println("Motorizacao: " + aviaoLido.get(i).getTipoMotor());
                        System.out.println("Anfibio: " + aviaoLido.get(i).getAnfibio());
                        System.out.println("----------------------------------------");

                    }
                    ArrayList<Carro> carroLido = arq.lerCarro();
                    for (int i = 0; i < carros.size(); i++) {
                        System.out.println("ID: " + carroLido.get(i).getId());
                        System.out.println("Marca: " + carroLido.get(i).getMarca());
                        System.out.println("Modelo: " + carroLido.get(i).getModelo());
                        System.out.println("Ano: " + carroLido.get(i).getAno());
                        System.out.println("Potencia: " + carroLido.get(i).getPotencia() + " HP");
                        System.out.println("Motorizacao: " + carroLido.get(i).getTipoCarroceria());
                        System.out.println("Convercivel: " + carroLido.get(i).getConvercivel());
                        System.out.println("----------------------------------------");
                    }


                    break;
//----------------------------------------------------------------------------------------------------------
                case 3:
                    for (int i = 0; i < avioes.size(); i++) {
                        System.out.println("ID: " + avioes.get(i).getId());
                        System.out.println("Marca: " + avioes.get(i).getMarca());
                        System.out.println("Modelo: " + avioes.get(i).getModelo());
                        System.out.println("Ano: " + avioes.get(i).getAno());
                        System.out.println("Potencia: " + avioes.get(i).getPotencia() + " HP");
                        System.out.println("Motorizacao: " + avioes.get(i).getTipoMotor());
                        System.out.println("Anfibio: " + avioes.get(i).getAnfibio());
                        System.out.println("----------------------------------------");

                        System.out.println("Entre com o id do veiculo que deseja atualizar: ");
                        idMudar = sc.nextLine();

                        Aviao aviaoAtualizado = new Aviao();
                        System.out.println("Entre com o id do veiculo: ");
                        aviaoAtualizado.setId(sc.nextLine());
                        System.out.println("Entre com a marca do veiculo: ");
                        aviaoAtualizado.setMarca(sc.nextLine());
                        System.out.println("Entre com o modelo do veiculo: ");
                        aviaoAtualizado.setModelo(sc.nextLine());
                        System.out.println("Entre com o ano do veiculo: ");
                        aviaoAtualizado.setAno(sc.nextInt());
                        sc.nextLine();
                        System.out.println("Entre com a potencia do veiculo: ");
                        aviaoAtualizado.setPotencia(sc.nextFloat());
                        sc.nextLine();
                        System.out.println("Entre com o numero de lugares: ");
                        aviaoAtualizado.setNumLugares(sc.nextInt());
                        sc.nextLine();
                        System.out.println("Entre com o tipo da motorizacao: ");
                        aviaoAtualizado.setTipoMotor(sc.nextLine());
                        System.out.println("O aviao é anfibio ?");
                        aviaoAtualizado.setAnfibio(sc.nextLine());

                        arq.atualizarAviao(aviaoAtualizado, idMudar);

                        break;

                    }
//----------------------------------------------------------------------------------------------------------
                case 4:
                    System.out.println("Qual tipo de veiculo voce deseja interagir ? (carro/aviao)");
                    escolha = sc.nextLine();

                    if (escolha.equals("aviao")) {
                        for (int i = 0; i < avioes.size(); i++) {
                            System.out.println(i + " - " + avioes.get(i).getMarca() + " " + avioes.get(i).getModelo());
                        }
                        System.out.println("Entre com o numero do veiculo que deseja acionar:");
                        escolha2 = sc.nextInt();
                        sc.nextLine();

                        System.out.println("O que deseja fazer ? (ligar/buzinar)");
                        escolha3 = sc.nextLine();
                        if (escolha3.equals("ligar")) {
                            avioes.get(escolha2).ligar();
                        } else if (escolha3.equals("buzinar")) {
                            avioes.get(escolha2).buzina();
                        }
                    } else if (escolha.equals("carro")) {
                        for (int i = 0; i < carros.size(); i++) {
                            System.out.println(i + " - " + carros.get(i).getMarca() + " " + carros.get(i).getModelo());
                        }
                        System.out.println("Entre com o numero do veiculo que deseja acionar:");
                        escolha2 = sc.nextInt();
                        sc.nextLine();

                        System.out.println("O que deseja fazer ? (ligar/buzinar)");
                        escolha3 = sc.nextLine();
                        if (escolha3.equals("ligar")) {
                            carros.get(escolha2).ligar();
                        } else if (escolha3.equals("buzinar")) {
                            carros.get(escolha2).buzina();
                        }
                    }

                        break;

                    //----------------------------------------------------------------------------------------------------------
                case 5:
                    for (int i = 0; i < avioes.size(); i++) {
                        System.out.println("ID: " + avioes.get(i).getId());
                        System.out.println("Marca: " + avioes.get(i).getMarca());
                        System.out.println("Modelo: " + avioes.get(i).getModelo());
                        System.out.println("Ano: " + avioes.get(i).getAno());
                        System.out.println("Potencia: " + avioes.get(i).getPotencia() + " HP");
                        System.out.println("Motorizacao: " + avioes.get(i).getTipoMotor());
                        System.out.println("Anfibio: " + avioes.get(i).getAnfibio());
                        System.out.println("----------------------------------------");

                        System.out.println("Entre com o id do veiculo que deseja deletar: ");
                        idDeletar = sc.nextLine();

                    }
              //-----------------------------------------------------------------------------------------------------------------
                            case 0:
                            // Saindo do menu
                            controle = false;
                            break;
                        default:
                            System.out.println("Opção inválida !!!!");
                            break;


            }

        }
    }
}

