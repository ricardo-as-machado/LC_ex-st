//Primeiro exercicio de java do leetcode- Sum of Digits of String After Convert
 
class Solution {
    public int getLucky(String s, int k) {
        // Converte cada caractere da string em seu valor numérico correspondente
        StringBuilder number = new StringBuilder();
        for (char x : s.toCharArray()) {
            number.append(x - 'a' + 1);
        }
        
        // Executa a transformação `k` vezes
        while (k > 0) {
            int temp = 0;
            for (char x : number.toString().toCharArray()) {
                temp += x - '0';  // Soma os dígitos do número atual
            }
            number = new StringBuilder(String.valueOf(temp));  // Converte a soma de volta para uma string
            k--;
        }
        return Integer.parseInt(number.toString());  // Retorna o resultado final como um inteiro
    }
}
