import javax.swing.DefaultListModel;

public class JSCFrame extends javax.swing.JFrame {

	private final IRepository<Contact, Integer> repository;
	private final DefaultListModel<Contact> listModel;

	/**
	 * Creates new form JSCFrame
	 */
	public JSCFrame(IRepository<Contact, Integer> repository) {
		this.repository = repository;
		listModel = new DefaultListModel<>();
		initComponents();
		fillListItems();
		jListContacts.setModel(listModel);
	}

	@SuppressWarnings("unchecked")
  private void initComponents() {

    jPanelContacts = new javax.swing.JPanel();
    jScrollPaneContacts = new javax.swing.JScrollPane();
    jListContacts = new javax.swing.JList<>();
    jPanelInformation = new javax.swing.JPanel();
    jLabelFirstName = new javax.swing.JLabel();
    jTextFieldFirstName = new javax.swing.JTextField();
    jLabelLastName = new javax.swing.JLabel();
    jTextFieldLastName = new javax.swing.JTextField();
    jLabelEmail = new javax.swing.JLabel();
    jTextFieldEmail = new javax.swing.JTextField();
    jLabelPhoneNumber = new javax.swing.JLabel();
    jTextFieldPhoneNumber = new javax.swing.JTextField();
    jLabelWebAddress = new javax.swing.JLabel();
    jTextFieldWebAddress = new javax.swing.JTextField();
    jLabelAddress = new javax.swing.JLabel();
    jScrollPaneAddress = new javax.swing.JScrollPane();
    jTextAreaAddress = new javax.swing.JTextArea();
    jLabelNotes = new javax.swing.JLabel();
    jScrollPaneNotes = new javax.swing.JScrollPane();
    jTextAreaNotes = new javax.swing.JTextArea();
    jButtonRemove = new javax.swing.JButton();
    jButtonUpdate = new javax.swing.JButton();
    jButtonAdd = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Java Swing Contact");
    setName("JSCFrame");
    setResizable(false);
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowClosing(java.awt.event.WindowEvent evt) {
        formWindowClosing(evt);
      }
    });

    jPanelContacts.setBorder(javax.swing.BorderFactory.createTitledBorder("Contacts"));
    jPanelContacts.setPreferredSize(new java.awt.Dimension(150, 300));
    jPanelContacts.setLayout(new java.awt.BorderLayout(5, 5));

    jScrollPaneContacts.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

    jListContacts.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    jListContacts.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
      public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
        jListContactsValueChanged(evt);
      }
    });
    jScrollPaneContacts.setViewportView(jListContacts);

    jPanelContacts.add(jScrollPaneContacts, java.awt.BorderLayout.CENTER);

    jPanelInformation.setBorder(javax.swing.BorderFactory.createTitledBorder("Contact Information"));

    jLabelFirstName.setText("First Name:");

    jLabelLastName.setText("Last Name:");

    jLabelEmail.setText("E-mail:");

    jLabelPhoneNumber.setText("Phone Number:");

    jLabelWebAddress.setText("Web Address:");

    jLabelAddress.setText("Address:");

    jTextAreaAddress.setColumns(20);
    jTextAreaAddress.setLineWrap(true);
    jTextAreaAddress.setRows(5);
    jScrollPaneAddress.setViewportView(jTextAreaAddress);

    jLabelNotes.setText("Notes:");

    jTextAreaNotes.setColumns(20);
    jTextAreaNotes.setLineWrap(true);
    jTextAreaNotes.setRows(5);
    jScrollPaneNotes.setViewportView(jTextAreaNotes);

    jButtonRemove.setText("Remove");
    jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonRemoveActionPerformed(evt);
      }
    });

    jButtonUpdate.setText("Update");
    jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonUpdateActionPerformed(evt);
      }
    });

    jButtonAdd.setText("Add");
    jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonAddActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanelInformationLayout = new javax.swing.GroupLayout(jPanelInformation);
    jPanelInformation.setLayout(jPanelInformationLayout);
    jPanelInformationLayout.setHorizontalGroup(
      jPanelInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanelInformationLayout.createSequentialGroup()
        .addGap(6, 6, 6)
        .addGroup(jPanelInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabelNotes, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabelAddress, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabelWebAddress, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabelPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabelEmail, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabelLastName, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabelFirstName, javax.swing.GroupLayout.Alignment.TRAILING))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanelInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jTextFieldEmail)
          .addComponent(jTextFieldLastName)
          .addComponent(jTextFieldPhoneNumber)
          .addComponent(jTextFieldWebAddress)
          .addComponent(jScrollPaneAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
          .addComponent(jScrollPaneNotes)
          .addComponent(jTextFieldFirstName)))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInformationLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jButtonAdd)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jButtonUpdate)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jButtonRemove)
        .addContainerGap())
    );
    jPanelInformationLayout.setVerticalGroup(
      jPanelInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanelInformationLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanelInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelFirstName)
          .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanelInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelLastName)
          .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanelInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelEmail)
          .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanelInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelPhoneNumber)
          .addComponent(jTextFieldPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanelInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelWebAddress)
          .addComponent(jTextFieldWebAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanelInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPaneAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabelAddress))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanelInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabelNotes)
          .addComponent(jScrollPaneNotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
        .addGroup(jPanelInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButtonRemove)
          .addComponent(jButtonUpdate)
          .addComponent(jButtonAdd))
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanelContacts, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jPanelInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(jPanelInformation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanelContacts, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(0, 10, Short.MAX_VALUE))
    );

    pack();
  }
  private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {
		Contact c = new Contact(jTextFieldFirstName.getText(),
						jTextFieldLastName.getText(),
						jTextFieldEmail.getText(),
						jTextFieldPhoneNumber.getText(),
						jTextAreaAddress.getText(),
						jTextFieldWebAddress.getText(),
						jTextAreaNotes.getText());
		repository.add(c);
		listModel.addElement(c);
		clearInput();
  }

  private void formWindowClosing(java.awt.event.WindowEvent evt) {
		this.repository.save();
  }

  private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {
		int selectedIndex = jListContacts.getSelectedIndex();
		if (selectedIndex < 0) {
			return;
		}
		repository.remove(selectedIndex);
		listModel.remove(selectedIndex);
		clearInput();
  }

  private void jListContactsValueChanged(javax.swing.event.ListSelectionEvent evt) {
		Contact selectedContact = jListContacts.getSelectedValue();
		if (selectedContact == null) {
			return;
		}
		jTextFieldFirstName.setText(selectedContact.getFirstName());
		jTextFieldLastName.setText(selectedContact.getLastName());
		jTextFieldEmail.setText(selectedContact.getEmail());
		jTextFieldPhoneNumber.setText(selectedContact.getPhoneNumber());
		jTextAreaAddress.setText(selectedContact.getAddress());
		jTextFieldWebAddress.setText(selectedContact.getWebAddress());
		jTextAreaNotes.setText(selectedContact.getNotes());
  }

  private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {
		Contact selectedContact = jListContacts.getSelectedValue();
		int selectedIndex = jListContacts.getSelectedIndex();
		if (selectedContact == null) {
			return;
		}
		selectedContact.setFirstName(jTextFieldFirstName.getText());
		selectedContact.setLastName(jTextFieldLastName.getText());
		selectedContact.setEmail(jTextFieldEmail.getText());
		selectedContact.setPhoneNumber(jTextFieldPhoneNumber.getText());
		selectedContact.setAddress(jTextAreaAddress.getText());
		selectedContact.setWebAddress(jTextFieldWebAddress.getText());
		selectedContact.setNotes(jTextAreaNotes.getText());
		repository.update(selectedIndex, selectedContact);
		listModel.setElementAt(selectedContact, selectedIndex);
		clearInput();
  }

  // Variables declaration
  private javax.swing.JButton jButtonAdd;
  private javax.swing.JButton jButtonRemove;
  private javax.swing.JButton jButtonUpdate;
  private javax.swing.JLabel jLabelAddress;
  private javax.swing.JLabel jLabelEmail;
  private javax.swing.JLabel jLabelFirstName;
  private javax.swing.JLabel jLabelLastName;
  private javax.swing.JLabel jLabelNotes;
  private javax.swing.JLabel jLabelPhoneNumber;
  private javax.swing.JLabel jLabelWebAddress;
  private javax.swing.JList<Contact> jListContacts;
  private javax.swing.JPanel jPanelContacts;
  private javax.swing.JPanel jPanelInformation;
  private javax.swing.JScrollPane jScrollPaneAddress;
  private javax.swing.JScrollPane jScrollPaneContacts;
  private javax.swing.JScrollPane jScrollPaneNotes;
  private javax.swing.JTextArea jTextAreaAddress;
  private javax.swing.JTextArea jTextAreaNotes;
  private javax.swing.JTextField jTextFieldEmail;
  private javax.swing.JTextField jTextFieldFirstName;
  private javax.swing.JTextField jTextFieldLastName;
  private javax.swing.JTextField jTextFieldPhoneNumber;
  private javax.swing.JTextField jTextFieldWebAddress;


	private void fillListItems() {
		listModel.clear();
		for (Contact contact : repository.getAll()) {
			listModel.addElement(contact);
		}
	}

	private void clearInput() {
		jTextFieldFirstName.setText("");
		jTextFieldLastName.setText("");
		jTextFieldEmail.setText("");
		jTextFieldPhoneNumber.setText("");
		jTextAreaAddress.setText("");
		jTextAreaNotes.setText("");
		jTextFieldWebAddress.setText("");
		jTextAreaNotes.setText("");
	}

}
