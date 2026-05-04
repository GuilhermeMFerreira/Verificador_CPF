// A validação do CPF foi feita no Java 25
void main(){

    while (true) {

        int val1, val2;

        //Leitura do CPF
        IO.println("\n--------------------------------");
        String cpf = IO.readln("Informe o CPF (Somente números):");

        //Verificar se o CPF tem 11 digitos
        /* cpf.length Retorna o número de caracteres da String CPF */
        if (cpf.length() != 11) {
            IO.println("O CPF Não tem 11 digitos!!");
            continue; //Faz voltar para o começo do CODIGO
        }

        //Calculo do primeiro digito do CPF
        int somatudo = 0;
        for (int i = 0; i <= 8; i++){

            // *Character.getNumericValue*    Converte letra para número
            int numero = Character.getNumericValue(cpf.charAt(i)) * (10 - i);
            somatudo += numero;

        }
        int resto1 = somatudo%11;

        if (resto1 >= 2){
            val1 = 11 - resto1;
        }
        else {
            val1 = 0;
        }

        int somatudo2 = 0;
        //Calculo do segundo digito do CPF
        for (int i = 0; i <= 9; i++){
            int numero = Character.getNumericValue(cpf.charAt(i)) * (11 - i);
            somatudo2 += numero;
        }

        int resto2 = somatudo2%11;

        if (resto2 >= 2){
            val2 = 11 - resto2;
        }

        else {
            val2 = 0;
        }

        //Comparando os digitos
        if (val1 == Character.getNumericValue(cpf.charAt(9)) && val2 == Character.getNumericValue(cpf.charAt(10))){
            IO.println("CPF está Válido!");

        }
        else {
            IO.println("CPF está Inválido!");
        }
    }
}