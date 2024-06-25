import java.util.Scanner;

public class loja {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("---------- BEM VINDO ----------");
        System.out.println("Indique qual aparelho deseja comprar: ");
        System.out.println("1.Iphone 15 pro (R$ 6.500)");
        System.out.println("2.Samsung galaxy S24 (R$ 5.200)");
        System.out.println("3.Xiaomi poco X3 pro (R$ 2.600)");
        System.out.println("4.Sair");
        int n = entrada.nextInt();

        switch (n) {
            case (1):
                iphone();
                break;
            case (2):
                sansumg();
                break;
            case (3):
                xiaomi();
                break;
            case (4):
                break;
            default:
                System.out.println("Indique umas das opções acima!");
                menu();
                break;
        }
    }

    public static void iphone() {
        System.out.println("------------------------------");
        System.out.println("ESCOLHA A CAPACIDADE DE MEMÓRIA DO SEU APARELHO:");
        System.out.println("1. 128 gb + 4 RAM (Sem acréscimo)");
        System.out.println("2. 256 gb + 6 RAM (Acréscimo de R$70)");
        System.out.println("3. 512 gb + 8 RAM (Acréscimo de R$120)");
        System.out.println("4. Retornar ao menu");
        int c = entrada.nextInt();

        switch (c) {
            case (1):
                iphone128();
                break;
            case (2):
                iphone256();
                break;
            case (3):
                iphone512();
                break;
            case (4):
                menu();
                break;
            default:
                System.out.println("Indique umas das opções acima!");
                iphone();
                break;
        }
    }

    public static void iphone128() {
        System.out.println("------------------------------");
        System.out.println("Informe a cor do aparelho:");
        System.out.println("1. Titânio branco (Acréscimo de R$50)");
        System.out.println("2. Titânio azul (Acréscimo de R$100)");
        System.out.println("3. Titânio preto (Acréscimo de R$70)");
        System.out.println("4. Retornar ao menu principal");
        System.out.println("5. Retornar ao menu do Iphone");
        int n = entrada.nextInt();

        if (n == 1) {
            System.out.println(" ");
            System.out.println("Informações da compra: Iphone 15 pro de 128gb + 4RAM da cor Branca");
            System.out.println("Valor da compra: R$" + (6500 + 50));
            Confirmar();
        }
        if (n == 2) {
            System.out.println(" ");
            System.out.println("Informações da compra: Iphone 15 pro de 128gb + 4RAM da cor Azul");
            System.out.println("Valor da compra: R$" + (6500 + 100));
            Confirmar();
        }
        if (n == 3) {
            System.out.println(" ");
            System.out.println("Informações da compra: Iphone 15 pro de 128gb + 4RAM da cor Preta");
            System.out.println("Valor da compra: R$" + (6500 + 70));
            Confirmar();
        }
        if (n == 4) {
            menu();
        }
        if (n == 5) {
            iphone();
        }
    }

    public static void iphone256() {
        System.out.println("------------------------------");
        System.out.println("Informe a cor do aparelho:");
        System.out.println("1. Titânio branco (Acréscimo de R$50)");
        System.out.println("2. Titânio azul (Acréscimo de R$100)");
        System.out.println("3. Titânio preto (Acréscimo de R$70)");
        System.out.println("4. Retornar ao menu principal");
        System.out.println("5. Retornar ao menu do Iphone");
        int n = entrada.nextInt();

        if (n == 1) {
            System.out.println(" ");
            System.out.println("Informações da compra: Iphone 15 pro de 256gb + 6RAM da cor Branca");
            System.out.println("Valor da compra: R$" + (6500 + 70 + 50));
            Confirmar();
        }
        if (n == 2) {
            System.out.println(" ");
            System.out.println("Informações da compra: Iphone 15 pro de 256gb + 6RAM da cor Azul");
            System.out.println("Valor da compra: R$" + (6500 + 70 + 100));
            Confirmar();
        }
        if (n == 3) {
            System.out.println(" ");
            System.out.println("Informações da compra: Iphone 15 pro de 256gb + 6RAM da cor Preta");
            System.out.println("Valor da compra: R$" + (6500 + 70 + 70));
            Confirmar();
        }
        if (n == 4) {
            menu();
        }
        if (n == 5) {
            iphone();
        }
    }

    public static void iphone512() {
        System.out.println("------------------------------");
        System.out.println("Informe a cor do aparelho:");
        System.out.println("1. Titânio branco (Acréscimo de R$50)");
        System.out.println("2. Titânio azul (Acréscimo de R$100)");
        System.out.println("3. Titânio preto (Acréscimo de R$70)");
        System.out.println("4. Retornar ao menu principal");
        System.out.println("5. Retornar ao menu do Iphone");
        int n = entrada.nextInt();

        if (n == 1) {
            System.out.println(" ");
            System.out.println("Informações da compra: Iphone 15 pro de 512gb + 8RAM da cor Branca");
            System.out.println("Valor da compra: R$" + (6500 + 120 + 50));
            Confirmar();
        }
        if (n == 2) {
            System.out.println(" ");
            System.out.println("Informações da compra: Iphone 15 pro de 512gb + 8RAM da cor Azul");
            System.out.println("Valor da compra: R$" + (6500 + 120 + 100));
            Confirmar();
        }
        if (n == 3) {
            System.out.println(" ");
            System.out.println("Informações da compra: Iphone 15 pro de 512gb + 8RAM da cor Preta");
            System.out.println("Valor da compra: R$" + (6500 + 120 + 70));
            Confirmar();
        }
        if (n == 4) {
            menu();
        }
        if (n == 5) {
            iphone();
        }
    }

    public static void sansumg() {
        System.out.println("------------------------------");
        System.out.println("ESCOLHA A CAPACIDADE DE MEMÓRIA DO SEU APARELHO:");
        System.out.println("1. 128 gb + 8 RAM (Sem acréscimo)");
        System.out.println("2. 256 gb + 8 RAM (Acréscimo de R$100)");
        System.out.println("3. 512 gb + 12 RAM (Acréscimo de R$150)");
        System.out.println("4. Retornar ao menu");
        int c = entrada.nextInt();

        switch (c) {
            case (1):
                sansumg128();
                break;
            case (2):
                sansumg256();
                break;
            case (3):
                sansumg512();
                break;
            case (4):
                menu();
                break;
            default:
                System.out.println("Indique umas das opções acima!");
                sansumg();
                break;
        }
    }

    public static void sansumg128() {
        System.out.println("------------------------------");
        System.out.println("Informe a cor do aparelho:");
        System.out.println("1. Preto (Acréscimo de R$40)");
        System.out.println("2. Azul (Acréscimo de R$90)");
        System.out.println("3. Verde (Acréscimo de R$120)");
        System.out.println("4. Retornar ao menu principal");
        System.out.println("5. Retornar ao menu da Sansumg");
        int n = entrada.nextInt();

        if (n == 1) {
            System.out.println(" ");
            System.out.println("Informações da compra: Samsung galaxy S24 de 128gb + 8RAM da cor Preta");
            System.out.println("Valor da compra: R$" + (5200 + 40));
            Confirmar();
        }
        if (n == 2) {
            System.out.println(" ");
            System.out.println("Informações da compra: Samsung galaxy S24 de 128gb + 8RAM da cor Azul");
            System.out.println("Valor da compra: R$" + (5200 + 90));
            Confirmar();
        }
        if (n == 3) {
            System.out.println(" ");
            System.out.println("Informações da compra: Samsung galaxy S24 de 128gb + 8RAM da cor Verde");
            System.out.println("Valor da compra: R$" + (5200 + 120));
            Confirmar();
        }
        if (n == 4) {
            menu();
        }
        if (n == 5) {
            sansumg();
        }
    }

    public static void sansumg256() {
        System.out.println("------------------------------");
        System.out.println("Informe a cor do aparelho:");
        System.out.println("1. Preto (Acréscimo de R$40)");
        System.out.println("2. Azul (Acréscimo de R$90)");
        System.out.println("3. Verde (Acréscimo de R$120)");
        System.out.println("4. Retornar ao menu principal");
        System.out.println("5. Retornar ao menu da Sansumg");
        int n = entrada.nextInt();

        if (n == 1) {
            System.out.println(" ");
            System.out.println("Informações da compra: Samsung galaxy S24 de 256gb + 8RAM da cor Preta");
            System.out.println("Valor da compra: R$" + (5200 + 100 + 40));
            Confirmar();
        }
        if (n == 2) {
            System.out.println(" ");
            System.out.println("Informações da compra: Samsung galaxy S24 de 256gb + 8RAM da cor Azul");
            System.out.println("Valor da compra: R$" + (5200 + 100 + 90));
            Confirmar();
        }
        if (n == 3) {
            System.out.println(" ");
            System.out.println("Informações da compra: Samsung galaxy S24 de 256gb + 8RAM da cor Verde");
            System.out.println("Valor da compra: R$" + (5200 + 100 + 120));
            Confirmar();
        }
        if (n == 4) {
            menu();
        }
        if (n == 5) {
            sansumg();
        }
    }

    public static void sansumg512() {
        System.out.println("------------------------------");
        System.out.println("Informe a cor do aparelho:");
        System.out.println("1. Preto (Acréscimo de R$40)");
        System.out.println("2. Azul (Acréscimo de R$90)");
        System.out.println("3. Verde (Acréscimo de R$120)");
        System.out.println("4. Retornar ao menu principal");
        System.out.println("5. Retornar ao menu da Sansumg");
        int n = entrada.nextInt();

        if (n == 1) {
            System.out.println(" ");
            System.out.println("Informações da compra: Samsung galaxy S24 de 512gb + 12RAM da cor Preta");
            System.out.println("Valor da compra: R$" + (5200 + 150 + 40));
            Confirmar();
        }
        if (n == 2) {
            System.out.println(" ");
            System.out.println("Informações da compra: Samsung galaxy S24 de 512gb + 12RAM da cor Azul");
            System.out.println("Valor da compra: R$" + (5200 + 150 + 90));
            Confirmar();
        }
        if (n == 3) {
            System.out.println(" ");
            System.out.println("Informações da compra: Samsung galaxy S24 de 512gb + 12RAM da cor Verde");
            System.out.println("Valor da compra: R$" + (5200 + 150 + 120));
            Confirmar();
        }
        if (n == 4) {
            menu();
        }
        if (n == 5) {
            sansumg();
        }
    }

    public static void xiaomi() {
        System.out.println("------------------------------");
        System.out.println("ESCOLHA A CAPACIDADE DE MEMÓRIA DO SEU APARELHO:");
        System.out.println("1. 256 gb + 8 RAM (Acréscimo de R$100)");
        System.out.println("2. 512 gb + 12 RAM (Acréscimo de R$180)");
        System.out.println("3. Retornar ao menu");
        int c = entrada.nextInt();

        switch (c) {
            case (1):
                xiaomi256();
                break;
            case (2):
                xiaomi512();
                break;
            case (3):
                menu();
                break;
            default:
                System.out.println("Indique umas das opções acima!");
                xiaomi();
                break;
        }
    }

    public static void xiaomi256() {
        System.out.println("------------------------------");
        System.out.println("Cor única: Preto (Acréscimo de R$50)");
        System.out.printf("Confirmar escolha? %n1.Sim %n2.Não %n");
        int a = entrada.nextInt();

        if (a == 1) {
            System.out.println(" ");
            System.out.println("Informações da compra: Xiaomi poco X6 pro de 256gb + 8RAM da cor Preta");
            System.out.println("Valor da compra: R$" + (2600 + 100 + 50));
            Confirmar();
        } else {
            System.out.println("O que deseja fazer? ");
            System.out.println("1. Retornar ao menu principal");
            System.out.println("2. Retornar ao menu da Xiaomi");
            int c = entrada.nextInt();
            if (c == 1) {
                menu();
            } else if (c == 2) {
                xiaomi();
            } else {
                while (c != 1 || c != 2) {
                    System.out.println("Selecione umas das opções abaixo: ");
                    System.out.println("1. Retornar ao menu principal");
                    System.out.println("2. Retornar ao menu da Xiaomi");
                    c = entrada.nextInt();
                    if (c == 1) {
                        menu();
                    } else if (c == 2) {
                        xiaomi();
                    }
                }
            }
        }
    }

    public static void xiaomi512() {
        System.out.println("------------------------------");
        System.out.println("Cor única: Preto (Acréscimo de R$50)");
        System.out.printf("Confirmar escolha? %n1.Sim %n2.Não %n");
        int a = entrada.nextInt();

        if (a == 1) {
            System.out.println(" ");
            System.out.println("Informações da compra: Xiaomi poco X6 pro de 512gb + 12RAM da cor Preta");
            System.out.println("Valor da compra: R$" + (2600 + 180 + 50));
            Confirmar();
        } else {
            System.out.println("O que deseja fazer? ");
            System.out.println("1. Retornar ao menu principal");
            System.out.println("2. Retornar ao menu da Xiaomi");
            int c = entrada.nextInt();
            if (c == 1) {
                menu();
            } else if (c == 2) {
                xiaomi();
            } else {
                while (c != 1 || c != 2) {
                    System.out.println("Selecione umas das opções abaixo: ");
                    System.out.println("1. Retornar ao menu principal");
                    System.out.println("2. Retornar ao menu da Xiaomi");
                    c = entrada.nextInt();
                    if (c == 1) {
                        menu();
                    } else if (c == 2) {
                        xiaomi();
                    }
                }
            }
        }

    }

    public static void Confirmar() {
        System.out.println("------------------------------");
        System.out.printf("Prosseguir com a compra? %n1.Sim %n2.Não %n");
        int c = entrada.nextInt();

        switch (c) {
            case (1):
                finalizar();
                break;
            case (2):
                menu();
                break;
            default:
                System.out.println("Selecione umas das opções acima!");
                Confirmar();
                break;
        }
    }

    public static void finalizar() {
        cadastro c = new cadastro();
        System.out.println("------------------------------");
        System.out.printf("Já possui cadastro? %n1.Sim %n2.Não %n");
        int a = entrada.nextInt();

        if (a == 1) {
            System.out.println("Realize login: ");
            System.out.println(" ");
            System.out.println("Informe o nome para acesso:");
            entrada.nextLine();
            String n = entrada.nextLine();
            if (n.equals(c.getnome())) {
                System.out.println("Nome correto!");
            } else {
                while (n != c.getnome()) {
                    System.out.println("Nome incorreto, tente novamente");
                    n = entrada.nextLine();
                    if (n.equals(c.getnome())) {
                        System.out.println("Nome correto!");
                        break;
                    }
                }
            }
            System.out.println(" ");
            System.out.println("Informe sua senha:");
            n = entrada.nextLine();
            if (n.equals(c.getsenha())) {
                System.out.println("Senha correta!");
            } else {
                while (n != c.getsenha()) {
                    System.out.println("Senha incorreta, tente novamente");
                    n = entrada.nextLine();
                    if (n.equals(c.getsenha())) {
                        System.out.println("Senha correta!");
                        break;
                    }
                }
            }
        }

        if (a == 2) {
            System.out.println("Preencha as informações abaixo: ");
            System.out.println(" ");
            System.out.println("Informe seu nome:");
            entrada.nextLine();
            c.setnome(entrada.nextLine());
            System.out.println("Informe seu e-mail:");
            c.setemail(entrada.nextLine());
            System.out.println("Informe um número para contato:");
            c.setnumero(entrada.nextLine());
            System.out.println("Crie uma senha:");
            c.setsenha(entrada.nextLine());
            System.out.println(" ");
            System.out.println("CADASTRO REALIZADO COM SUCESSO!");
        }
        pagamento();
    }

    public static void pagamento() {
        System.out.println("------------------------------");
        System.out.println("Informe o método de pagamento: ");
        System.out.println("1.PIX");
        System.out.println("2.Cartão débito");
        System.out.println("3.Cartão crédito");
        System.out.println("4.Boleto bancário");
        System.out.println("5.Cancelar");
        int m = entrada.nextInt();
        System.out.println(" ");

        switch (m) {
            case (1):
                System.out.println("GERAR QRCODE");
                break;
            case (2):
                System.out.println("Informe o número do cartão:");
                entrada.nextLine();
                String n = entrada.nextLine();
                System.out.println("Informe a validade do cartão:");
                n = entrada.nextLine();
                System.out.println("Informe o nome presente no cartão");
                n = entrada.nextLine();
                break;
            case (3):
                System.out.println("Informe o número do cartão:");
                entrada.nextLine();
                n = entrada.nextLine();
                System.out.println("Informe a validade do cartão:");
                n = entrada.nextLine();
                System.out.println("Informe o nome presente no cartão");
                n = entrada.nextLine();
                System.out.println("Informe em quantas vezes voce irá dividir:");
                n = entrada.nextLine();
                break;
            case (4):
                System.out.println("GERAR BOLETO BANCARIO");
                break;
            case (5):
                break;
            default:
                System.out.println("Indique umas das opções acima!");
                pagamento();
                break;
        }
    }

}
