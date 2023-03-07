public class TauxDeChange {
    public static void main(String... args){
        //je definis la variable à modifier
        int monnaieaechanger;
        monnaieaechanger=1500;
        // je definis la valeur du taux de change
        double txdechange;
        txdechange=1.22;
        //je stocke le resultat et je l'affiche
        double monnaieconvertie;
        monnaieconvertie=monnaieaechanger*txdechange;
        System.out.println(monnaieconvertie);
    }
}
