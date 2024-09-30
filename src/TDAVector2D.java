import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TDAVector2D {
    private JPanel pGeneral;
    private JTextField txtV1x;
    private JTextField txtV1y;
    private JTextField txtV2x;
    private JTextField txtV2y;
    private JTextArea txtResultado;
    private JButton calcularButton;
    private JButton limpiarButton;
    Vector2D a,b;
    public TDAVector2D() {

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a= new Vector2D(Double.parseDouble(txtV1x.getText()), Double.parseDouble(txtV1y.getText()));
                b= new Vector2D(Double.parseDouble(txtV2x.getText()), Double.parseDouble(txtV2y.getText()));

                txtResultado.append("\nVector1: "+a.toString());
                txtResultado.append("\nVector1: "+b.toString());
                txtResultado.append("\nSuma: "+a.suma(b));
                txtResultado.append("\nResta: "+a.resta(b));
                txtResultado.append("\nMultiplicacion: "+a.multiplicacion(b));
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtV1x.setText("");
                txtV1y.setText("");
                txtV2x.setText("");
                txtV2y.setText("");
                txtResultado.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TDAVector2D");
        frame.setContentPane(new TDAVector2D().pGeneral);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
