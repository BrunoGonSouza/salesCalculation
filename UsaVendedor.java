public class UsaVendedor {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor(0, 0, null, 0);

        v1.setNome("Bruno");
        v1.setVendas(2000);
        v1.setSalario(2079);
        v1.setFalta(2);

        v1.descontoFalta();
        v1.calcularComissao();
        v1.calcularSalario();

        v1.imprimeDados();

        

    }
}
