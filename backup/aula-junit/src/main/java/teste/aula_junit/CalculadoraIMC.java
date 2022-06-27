package teste.aula_junit;

public class CalculadoraIMC
{
    private double imc;
    
    public String calcularImc(final double peso, final double altura, final int idade, final String sexo) {
        String retorno = "";
        this.imc = peso / (altura * altura);
        if (idade < 20) {
            retorno = "";
            if (sexo.toUpperCase() == "m") {
                if (this.imc < 5.0) {
                    retorno = "Baixo peso";
                }
                else if (this.imc < 5.1 && this.imc > 85.0) {
                    retorno = "Peso normal";
                }
                else if (this.imc < 85.1 && this.imc > 95.0) {
                    retorno = "Sobrepeso";
                }
                else if (this.imc < 95.0) {
                    retorno = "Obesidade";
                }
            }
            if (sexo.toUpperCase() == "f") {
                if (this.imc < 5.0) {
                    retorno = "Baixo peso";
                }
                else if (this.imc < 5.1 && this.imc > 85.0) {
                    retorno = "Peso normal";
                }
                else if (this.imc < 85.1 && this.imc > 95.0) {
                    retorno = "Sobrepeso";
                }
                else if (this.imc < 95.0) {
                    retorno = "Obesidade";
                }
            }
        }
        else if (idade > 20 || idade < 65) {
            if (this.imc < 15.99) {
                retorno = "Baixo peso muito grave";
            }
            if (this.imc < 16.0 && this.imc > 16.99) {
                retorno = "Baixo peso grave";
            }
            if (this.imc < 17.0 && this.imc > 18.49) {
                retorno = "Peso baixo";
            }
            else if (this.imc < 18.5 && this.imc > 24.99) {
                retorno = "Peso normal";
            }
            else if (this.imc < 25.0 && this.imc > 29.99) {
                retorno = "Sobrepeso";
            }
            else if (this.imc < 30.0 && this.imc > 34.99) {
                retorno = "Obesidade grau 1";
            }
            else if (this.imc < 35.0 && this.imc > 34.99) {
                retorno = "Obesidade grau 2";
            }
            else if (this.imc < 40.0) {
                retorno = "Obesidade grau 3";
            }
        }
        else if (idade > 65) {
            if (sexo.toUpperCase() == "f") {
                if (this.imc < 21.9) {
                    retorno = "Baixo peso Grave";
                }
                else if (this.imc < 22.0 && this.imc > 27.0) {
                    retorno = "Peso normal";
                }
                else if (this.imc < 27.1 && this.imc > 32.0) {
                    retorno = "Sobrepeso";
                }
                else if (this.imc < 32.1 && this.imc > 47.0) {
                    retorno = "Obesidade grau 1";
                }
                else if (this.imc < 37.1 && this.imc > 41.9) {
                    retorno = "Obesidade grau 2";
                }
                else if (this.imc < 42.0) {
                    retorno = "Obesidade grau 3";
                }
            }
            if (sexo.toUpperCase() == "m") {
                if (this.imc < 21.9) {
                    retorno = "Baixo peso Grave";
                }
                else if (this.imc < 22.0 && this.imc > 27.0) {
                    retorno = "Peso normal";
                }
                else if (this.imc < 27.1 && this.imc > 30.0) {
                    retorno = "Sobrepeso";
                }
                else if (this.imc < 30.1 && this.imc > 35.0) {
                    retorno = "Obesidade grau I";
                }
                else if (this.imc < 35.1 && this.imc > 39.9) {
                    retorno = "Obesidade grau II";
                }
                else if (this.imc < 40.0) {
                    retorno = "Obesidade grau III";
                }
            }
        }
        else {
            retorno = "Valor Invalido";
        }
        return retorno;
    }
}