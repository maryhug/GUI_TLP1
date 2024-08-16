package Vistas;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.Color;

public class PanelPrincipal extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	
	public PanelPrincipal() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelMenu = new JPanel();
		add(panelMenu, BorderLayout.WEST);
		
		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Prueba de Aplicacion") {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("colors");
						node_1.add(new DefaultMutableTreeNode("blue"));
						node_1.add(new DefaultMutableTreeNode("violet"));
						node_1.add(new DefaultMutableTreeNode("red"));
						node_1.add(new DefaultMutableTreeNode("yellow"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("sports");
						node_1.add(new DefaultMutableTreeNode("basketball"));
						node_1.add(new DefaultMutableTreeNode("soccer"));
						node_1.add(new DefaultMutableTreeNode("football"));
						node_1.add(new DefaultMutableTreeNode("hockey"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("food");
						node_1.add(new DefaultMutableTreeNode("hot dogs"));
						node_1.add(new DefaultMutableTreeNode("pizza"));
						node_1.add(new DefaultMutableTreeNode("ravioli"));
						node_1.add(new DefaultMutableTreeNode("bananas"));
					add(node_1);
				}
			}
		));
		panelMenu.add(tree);
		
		JPanel panelInferior = new JPanel();
		add(panelInferior, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1 = new JLabel("Creditos Desarrollador");
		panelInferior.add(lblNewLabel_1);
		
		JPanel panelSuperior = new JPanel();
		add(panelSuperior, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Titulo Aplicacion ^^");
		lblNewLabel.setForeground(new Color(128, 128, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		panelSuperior.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);

	}

}
