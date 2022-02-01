package ec.edu.ups.Prueba.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.namespace.QName;

import ec.edu.ups.Prueba.Arte;
import ec.edu.ups.Prueba.ArteSOAP;
import ec.edu.ups.Prueba.ArteSOAPService;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListarArte extends JFrame {

	private JPanel contentPane;
    private static final QName SERVICE_NAME = new QName("http://services.prueba.ups.edu.ec/", "ArteSOAPService");
    private static ArteSOAP port;
    JTextArea txtArea;
    private JButton btnNewButton;
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
					ListarArte frame = new ListarArte();
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
	public ListarArte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 814, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(87, 57, 592, 268);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(54, 59, 450, 163);
		panel.add(scrollPane);
		
		txtArea = new JTextArea();
		scrollPane.setViewportView(txtArea);
		
		btnNewButton = new JButton("Listar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Listar();
			}
		});
		btnNewButton.setBounds(314, 341, 85, 21);
		contentPane.add(btnNewButton);
	}
	
	public void Listar() {

        java.util.List<ec.edu.ups.Prueba.Arte> arte = port.getObras();
       
        for(int i=0;i<arte.size();i++) {
        	txtArea.append(arte.get(i).getCodigo());
        	txtArea.append("\n");
        	txtArea.append(arte.get(i).getAutor());
        	txtArea.append("\n");
        	txtArea.append(arte.get(i).getNombreObra());
        	txtArea.append("\n");
        	txtArea.append(arte.get(i).getOrigen());
        	txtArea.append("\n");
        	txtArea.append("************************************************ \n");
        }
	}
}
