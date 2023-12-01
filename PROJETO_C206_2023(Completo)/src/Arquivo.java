import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    public void escreverAviao(Aviao aviao) {
            OutputStream os = null;
            OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            // Recebe o nome do arquivo
            os = new FileOutputStream("novoTeste.txt", true); // Arquivo

            // Mostra em qual arquivo estaremos escrevendo
            osw = new OutputStreamWriter(os);

            // Permite que escrevamos no arquivo
            bw = new BufferedWriter(osw);

            bw.write("-*aviao*-" + "\n");
            bw.write(aviao.getId() + "\n");
            bw.write(aviao.getMarca() + "\n");
            bw.write(aviao.getModelo() + "\n");
            bw.write(aviao.getAno() + "\n");
            bw.write(aviao.getPotencia() + "\n");
            bw.write(aviao.getNumLugares() + "\n");
            bw.write(aviao.getTipoMotor() + "\n");
            bw.write(aviao.getAnfibio() + "\n");

        } catch (Exception e) {

        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void escreverCarro(Carro carro) {
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            // Recebe o nome do arquivo
            os = new FileOutputStream("novoTeste.txt", true); // Arquivo

            // Mostra em qual arquivo estaremos escrevendo
            osw = new OutputStreamWriter(os);

            // Permite que escrevamos no arquivo
            bw = new BufferedWriter(osw);

            bw.write("-*carro*-" + "\n");
            bw.write(carro.getId() + "\n");
            bw.write(carro.getMarca() + "\n");
            bw.write(carro.getModelo() + "\n");
            bw.write(carro.getAno() + "\n");
            bw.write(carro.getPotencia() + "\n");
            bw.write(carro.getNumLugares() + "\n");
            bw.write(carro.getTipoCarroceria() + "\n");
            bw.write(carro.getConvercivel() + "\n");

        } catch (Exception e) {

        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


    // 2. Leitura
    public ArrayList<Aviao> lerAviao() {
        // Coleção que armazenará todos os avioes encontrados no meu arquivo
        ArrayList<Aviao> avioesEncontradosNoArquivo = new ArrayList<>();

        // Estrutura para leitura de dados
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String auxLeitura; // Vai ser o nosso ponteiro do arquivo

        try {
            // Estrutura básica para leitura
            is = new FileInputStream("novoTeste.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            // Realizando a leitura dos dados
            auxLeitura = br.readLine();

            while (auxLeitura != null) {
                // Comparando se o ponteio é igual a flag
                if (auxLeitura.equalsIgnoreCase("-*aviao*-")) {
                    // Criar a estrutura para tratar as infos do veiculos no Java
                    Aviao auxAviao = new Aviao();
                    auxAviao.setId(br.readLine());
                    auxAviao.setMarca(br.readLine());
                    auxAviao.setModelo(br.readLine());
                    auxAviao.setAno(Integer.parseInt(br.readLine()));
                    auxAviao.setPotencia(Float.parseFloat(br.readLine()));
                    auxAviao.setNumLugares(Integer.parseInt(br.readLine()));
                    auxAviao.setTipoMotor(br.readLine());
                    auxAviao.setAnfibio(br.readLine());


                    // Adicionando o aviao no array list
                    avioesEncontradosNoArquivo.add(auxAviao);
                }
                auxLeitura = br.readLine(); // Pula para a próxima linha
            }


        } catch (Exception e) {

        } finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        return avioesEncontradosNoArquivo;
    }

    public ArrayList<Carro> lerCarro() {
        // Coleção que armazenará todos os carros encontrados no meu arquivo
        ArrayList<Carro> carrosEncontradosNoArquivo = new ArrayList<>();

        // Estrutura para leitura de dados
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String auxLeitura; // Vai ser o nosso ponteiro do arquivo

        try {
            // Estrutura básica para leitura
            is = new FileInputStream("novoTeste.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            // Realizando a leitura dos dados
            auxLeitura = br.readLine();

            while (auxLeitura != null) {
                // Comparando se o ponteio é igual a flag
                if (auxLeitura.equalsIgnoreCase("-*carro*-")) {
                    // Criar a estrutura para tratar as infos do veiculos no Java
                    Carro auxCarro = new Carro();
                    auxCarro.setId(br.readLine());
                    auxCarro.setMarca(br.readLine());
                    auxCarro.setModelo(br.readLine());
                    auxCarro.setAno(Integer.parseInt(br.readLine()));
                    auxCarro.setPotencia(Float.parseFloat(br.readLine()));
                    auxCarro.setNumLugares(Integer.parseInt(br.readLine()));
                    auxCarro.setTipoCarroceria(br.readLine());
                    auxCarro.setConvercivel(br.readLine());


                    // Adicionando o carro no array list
                    carrosEncontradosNoArquivo.add(auxCarro);
                }
                auxLeitura = br.readLine(); // Pula para a próxima linha
            }

        } catch (Exception e) {

        } finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return carrosEncontradosNoArquivo;
    }

    //------------------------------------------------------------------------------------------------------------
    public void atualizarAviao(Aviao aviaonovo, String idMudar) throws FileNotFoundException {
        // Coleção que armazenará todos os funcionários encontrados no meu arquivo

        // Estrutura para leitura de dados
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String auxLeitura; // Vai ser o nosso ponteiro do arquivo

        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            // Estrutura básica para leitura
            is = new FileInputStream("novoTeste.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            // Recebe o nome do arquivo
            os = new FileOutputStream("novoTeste.txt", true); // Arquivo

            // Mostra em qual arquivo estaremos escrevendo
            osw = new OutputStreamWriter(os);

            // Permite que escrevamos no arquivo
            bw = new BufferedWriter(osw);

            // Realizando a leitura dos dados
            auxLeitura = br.readLine();

            while (auxLeitura != null) {
                // Comparando se o ponteio é igual a flag

                // Criar a estrutura para tratar as infos do veiculos no Java
                bw.write(aviaonovo.getId() + "\n");
                bw.write(aviaonovo.getMarca() + "\n");
                bw.write(aviaonovo.getModelo() + "\n");
                bw.write(aviaonovo.getAno() + "\n");
                bw.write(aviaonovo.getPotencia() + "\n");
                bw.write(aviaonovo.getNumLugares() + "\n");
                bw.write(aviaonovo.getTipoMotor() + "\n");
                bw.write(aviaonovo.getAnfibio() + "\n");

            }
        } catch (Exception e) {

        } finally {
            try {
                bw.close();
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public void deletarAviao(String idDeletar) {
        // Coleção que armazenará todos os funcionários encontrados no meu arquivo
        ArrayList<Aviao> avioesEncontradosNoArquivo = new ArrayList<>();

        // Estrutura para leitura de dados
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String auxLeitura; // Vai ser o nosso ponteiro do arquivo

        try {
            // Estrutura básica para leitura
            is = new FileInputStream("novoTeste.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            // Realizando a leitura dos dados
            auxLeitura = br.readLine();

            while (auxLeitura != null) {
                // Comparando se o ponteio é igual a flag
                if (auxLeitura.equalsIgnoreCase(idDeletar)) {

                    auxLeitura = br.readLine(); // Pula para a próxima linha
                }


            }
        } catch (Exception e) {

        } finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}







