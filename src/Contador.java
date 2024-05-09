import java.util.Scanner;

public class Contador {

  public static void main(String[] args) {

    try (Scanner terminal = new Scanner(System.in)) {
      System.out.println("Digite o primeiro parâmetro:");
      int parametroUm = Integer.parseInt(terminal.nextLine());
      System.out.println("Digite o segundo parâmetro:");
      int parametroDois = Integer.parseInt(terminal.nextLine());

      contar(parametroUm, parametroDois);
    } catch (NumberFormatException e) {
      System.out.println("Por favor, forneça dois números inteiros válidos como parâmetros.");
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }
  }

  static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
    if (parametroUm >= parametroDois) {
      throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
    }

    int contagem = parametroDois - parametroUm;
    for (int i = 1; i <= contagem; i++) {
      System.out.println("Imprimindo o número " + i);
    }
  }
}