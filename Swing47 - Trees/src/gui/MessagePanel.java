package gui;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class MessagePanel extends JPanel {

	private JTree serverTree;

	public MessagePanel() {

		serverTree = new JTree(createTree());

		setLayout(new BorderLayout());

		add(new JScrollPane(serverTree), BorderLayout.CENTER);
	}

	private DefaultMutableTreeNode createTree() {
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("Servers");

		DefaultMutableTreeNode branch1 = new DefaultMutableTreeNode("USA");

		DefaultMutableTreeNode server1 = new DefaultMutableTreeNode("New York");
		DefaultMutableTreeNode server2 = new DefaultMutableTreeNode("Boston");
		DefaultMutableTreeNode server3 = new DefaultMutableTreeNode("California");
		DefaultMutableTreeNode server4 = new DefaultMutableTreeNode("Illinois");
		DefaultMutableTreeNode server5 = new DefaultMutableTreeNode("Texas");
		DefaultMutableTreeNode server6 = new DefaultMutableTreeNode("Arizona");
		DefaultMutableTreeNode server7 = new DefaultMutableTreeNode("Texas");
		DefaultMutableTreeNode server8 = new DefaultMutableTreeNode("California");
		DefaultMutableTreeNode server9 = new DefaultMutableTreeNode("Florida");
		DefaultMutableTreeNode server10 = new DefaultMutableTreeNode("Indiana");
		DefaultMutableTreeNode server11 = new DefaultMutableTreeNode("Ohio");
		DefaultMutableTreeNode server12 = new DefaultMutableTreeNode("North Carolina");
		DefaultMutableTreeNode server13 = new DefaultMutableTreeNode("Washington");
		DefaultMutableTreeNode server14 = new DefaultMutableTreeNode("Colorado");
		DefaultMutableTreeNode server15 = new DefaultMutableTreeNode("Tennessee");
		DefaultMutableTreeNode server16 = new DefaultMutableTreeNode("Oregon");
		DefaultMutableTreeNode server17 = new DefaultMutableTreeNode("Oklahoma");
		DefaultMutableTreeNode server18 = new DefaultMutableTreeNode("Nevada");
		DefaultMutableTreeNode server19 = new DefaultMutableTreeNode("Maryland");

		branch1.add(server1);
		branch1.add(server2);
		branch1.add(server3);
		branch1.add(server4);
		branch1.add(server5);
		branch1.add(server6);
		branch1.add(server7);
		branch1.add(server8);
		branch1.add(server9);
		branch1.add(server10);
		branch1.add(server11);
		branch1.add(server12);
		branch1.add(server13);
		branch1.add(server14);
		branch1.add(server15);
		branch1.add(server16);
		branch1.add(server17);
		branch1.add(server18);
		branch1.add(server19);

		DefaultMutableTreeNode branch2 = new DefaultMutableTreeNode("UK");
		DefaultMutableTreeNode server20 = new DefaultMutableTreeNode("London");
		DefaultMutableTreeNode server21 = new DefaultMutableTreeNode("Edinburgh");

		branch2.add(server20);
		branch2.add(server21);

		top.add(branch1);
		top.add(branch2);

		return top;
	}

}
