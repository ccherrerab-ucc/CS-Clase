public class Pay implements PaysMethoh{
    private int id;
    private Enrollment enrollment;
    private double monto;

    // Constructor
    public Pay(int id, Enrollment matricula, double monto) {
        this.id = id;
        this.enrollment = matricula;
        this.monto = monto;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pago de " + monto + " procesado para la matrícula ID: " + enrollment.getIdEnrollment());
    }
    // Constructor
}
