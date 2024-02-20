import java.util.*;

public class Ex4 { //nao tem alinea b,c,d
    Ficha2 f2 = new Ficha2();
    public void execEx4(){
        Scanner scanner = new Scanner(System.in);
        List<String> listaString = new ArrayList<>();
        System.out.println("Introduza as strings que pretende colocar no array: (Quando terminar digite 'break')");
        while(true){
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("break")){
                break;
            }
            listaString.add(input);
        }

        String[] array = listaString.toArray(new String[0]); //converte a lista para um array de strings
        Set<String> set = new HashSet<>(Arrays.asList(array)); // converte o array para um set para remover strings repetidas
        String[] uniqueStringsArray = set.toArray(new String[0]); //converte da hashset para array novamente

        System.out.println("Array sem repetições: " + Arrays.toString(uniqueStringsArray));

    }
}
