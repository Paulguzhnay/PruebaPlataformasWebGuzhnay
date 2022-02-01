package ec.edu.ups.Prueba.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.namespace.QName;

import ec.edu.ups.Prueba.*;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.ActionEvent;

public class IngresarArte extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtAutor;
	private JTextField txtNombreObra;
	private JTextField txtOrigen;
    private static final QName SERVICE_NAME = new QName("http://services.prueba.ups.edu.ec/", "ArteSOAPService");
    private static ArteSOAP port;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		URL wsdlURL = ArteSOAPService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        ArteSOAPService ss = new ArteSOAPService(wsdlURL, SERVICE_NAME);
         port = ss.getArteSOAPPort();


		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {


					IngresarArte frame = new IngresarArte();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IngresarArte() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 884, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(59, 28, 708, 303);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INGRESAR OBRA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(193, 10, 314, 40);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 95, 79, 28);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Autor:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(10, 149, 79, 28);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nombre de la Obra:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(10, 213, 138, 28);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Origen:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(10, 265, 79, 28);
		panel.add(lblNewLabel_1_3);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(244, 102, 96, 19);
		panel.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtAutor = new JTextField();
		txtAutor.setColumns(10);
		txtAutor.setBounds(244, 156, 96, 19);
		panel.add(txtAutor);
		
		txtNombreObra = new JTextField();
		txtNombreObra.setColumns(10);
		txtNombreObra.setBounds(244, 220, 96, 19);
		panel.add(txtNombreObra);
		
		txtOrigen = new JTextField();
		txtOrigen.setColumns(10);
		txtOrigen.setBounds(244, 272, 96, 19);
		panel.add(txtOrigen);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ObtenerArte();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(556, 169, 101, 52);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("LISTAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarArte vtnListar = new ListarArte();
				vtnListar.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(348, 379, 85, 21);
		contentPane.add(btnNewButton_1);
	}
	
	public void ObtenerArte() {
		
		String codigo = txtCodigo.getText();
		String autor = txtAutor.getText();
		String origen = txtOrigen.getText();
		String nombreObra = txtNombreObra.getText();
		
		
		
		//ingresar 
		
		Arte art = new Arte();
		art.setCodigo(codigo);
		art.setAutor(autor);
		art.setNombreObra(nombreObra);
		art.setOrigen(origen);
		
        java.lang.String _insertar__return = port.insertar(art);
        System.out.println("insertar.result=" + art);
	}
}
