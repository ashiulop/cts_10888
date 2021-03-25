package ro.ase.csie.cts.g1088.dp.singleton;

public class TestSingleton {
    public static void main(String[] args) {
//        ConexiuneBD conexiune1 = new ConexiuneBD("asd", "asd");
//        ConexiuneBD conexiune2 = new ConexiuneBD("asd", "asd");
//
        ConexiuneBD conexiune1 = ConexiuneBD.getConexiune();
        ConexiuneBD conexiune2 = ConexiuneBD.getConexiune();

        if(conexiune1 == conexiune2) {
            System.out.println("referinte identice");
        } else {
            System.out.println("referinte diferite");
        }

        ModulUI modulUI = new ModulUI();
        ModulProfil modulProfil = new ModulProfil();

    }
}