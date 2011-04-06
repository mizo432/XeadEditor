package xeadEditor;

/*
 * Copyright (c) 2011 WATANABE kozo <qyf05466@nifty.com>,
 * All rights reserved.
 *
 * This file is part of XEAD Editor.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the XEAD Project nor the names of its contributors
 *       may be used to endorse or promote products derived from this software
 *       without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

import java.awt.*;

import javax.swing.*;

import org.w3c.dom.NodeList;
import xeadEditor.Editor.SortableDomElementListModel;
import xeadEditor.Editor.MainTreeNode;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.ResourceBundle;
//import java.util.ResourceBundle;
import java.util.StringTokenizer;

public class DialogAddFunction extends JDialog {
	private static final long serialVersionUID = 1L;
	private static ResourceBundle res = ResourceBundle.getBundle("xeadEditor.Res");
	private JButton jButtonNext = new JButton();
	private JButton jButtonOK = new JButton();
	private JButton jButtonCancel = new JButton();
	private Editor frame_;
	private JLabel jLabelID = new JLabel();
	private JTextField jTextFieldID = new JTextField();
	private JLabel jLabelType = new JLabel();
	private JComboBox jComboBoxType = new JComboBox();
	private JTextField jTextFieldType = new JTextField();
	private Insets defaultMargin = null;
	private JLabel jLabelName = new JLabel();
	private Editor_KanjiTextField jTextFieldName = new Editor_KanjiTextField();
	private JLabel jLabelTableID = new JLabel();
	private JTextField jTextFieldTableID = new JTextField();
	private JLabel jLabelTableName = new JLabel();
	private JLabel jLabelTableKeys = new JLabel();
	private JTextField jTextFieldTableKeys = new JTextField();
	private JButton jButtonTableKeysEdit = new JButton();
	private String tableKeys = "";
	private JLabel jLabelHeaderTableID = new JLabel();
	private JTextField jTextFieldHeaderTableID = new JTextField();
	private JLabel jLabelHeaderTableName = new JLabel();
	private JLabel jLabelHeaderTableKeys = new JLabel();
	private JTextField jTextFieldHeaderTableKeys = new JTextField();
	private JButton jButtonHeaderTableKeysEdit = new JButton();
	private String headerTableKeys = "";
	private JLabel jLabelDetailTableID = new JLabel();
	private JTextField jTextFieldDetailTableID = new JTextField();
	private JLabel jLabelDetailTableName = new JLabel();
	private JLabel jLabelDetailTableKeys = new JLabel();
	private JTextField jTextFieldDetailTableKeys = new JTextField();
	private JButton jButtonDetailTableKeysEdit = new JButton();
	private String detailTableKeys = "";
	private JPanel jPanelCenter = new JPanel();
	private JPanel jPanelButtons = new JPanel();
	private org.w3c.dom.Element element = null;
	private String subsystemID_ = "";
	private MainTreeNode tableNode = null;
	private MainTreeNode headerTableNode = null;
	private MainTreeNode detailTableNode = null;
	private SortableDomElementListModel sortingList;
	private ArrayList<String> headerKeyList = new ArrayList<String>(); 
	private ArrayList<String> detailKeyList = new ArrayList<String>(); 
	private String detailRowNoID = "";
	private int returnCode = 0;
	private Color selectionColor = null;

	public DialogAddFunction(Editor frame) {
		super(frame, "", true);
		frame_ = frame;
		try {
			jbInit();
			pack();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	private void jbInit() throws Exception {
		//
		jPanelButtons.setBorder(BorderFactory.createEtchedBorder());
		jPanelButtons.setPreferredSize(new Dimension(350, 43));
		jPanelButtons.setLayout(null);
		jButtonNext.setBounds(new Rectangle(320, 10, 73, 25));
		jButtonNext.setFont(new java.awt.Font("Dialog", 0, 12));
		jButtonNext.setText(res.getString("Next"));
		jButtonNext.addActionListener(new DialogAddFunction_jButtonNext_actionAdapter(this));
		jButtonOK.setBounds(new Rectangle(320, 10, 73, 25));
		jButtonOK.setFont(new java.awt.Font("Dialog", 0, 12));
		jButtonOK.setText("OK");
		jButtonOK.addActionListener(new DialogAddFunction_jButtonOK_actionAdapter(this));
		jButtonCancel.setBounds(new Rectangle(44, 10, 73, 25));
		jButtonCancel.setFont(new java.awt.Font("Dialog", 0, 12));
		jButtonCancel.setText(res.getString("Cancel"));
		jButtonCancel.addActionListener(new DialogAddFunction_jButtonCancel_actionAdapter(this));
		//
		jPanelCenter.setBorder(BorderFactory.createEtchedBorder());
		jPanelCenter.setLayout(null);
		jLabelID.setText(res.getString("FunctionID"));
		jLabelID.setFont(new java.awt.Font("Dialog", 0, 12));
		jLabelID.setHorizontalAlignment(SwingConstants.RIGHT);
		jLabelID.setHorizontalTextPosition(SwingConstants.LEADING);
		jLabelID.setBounds(new Rectangle(11, 12, 89, 15));
		jTextFieldID.setFont(new java.awt.Font("Dialog", 0, 12));
		jTextFieldID.setBounds(new Rectangle(105, 9, 70, 21));
		selectionColor = jTextFieldID.getSelectionColor();
		jLabelType.setText(res.getString("FunctionType"));
		jLabelType.setFont(new java.awt.Font("Dialog", 0, 12));
		jLabelType.setHorizontalAlignment(SwingConstants.RIGHT);
		jLabelType.setHorizontalTextPosition(SwingConstants.LEADING);
		jLabelType.setBounds(new Rectangle(11, 40, 89, 15));
		//
		jComboBoxType.setEditable(false);
		jComboBoxType.setFont(new java.awt.Font("Dialog", 0, 12));
		jComboBoxType.setBounds(new Rectangle(105, 37, 200, 21));
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addElement(new ComboBoxItem("", res.getString("SelectFromList"), null));
		model.addElement(new ComboBoxItem("XF000", res.getString("FunctionTypeXF000"), new ImageIcon(xeadEditor.Editor.class.getResource("ifnc000.png"))));
		model.addElement(new ComboBoxItem("XF010", res.getString("FunctionTypeXF010"), new ImageIcon(xeadEditor.Editor.class.getResource("ifnc010.png"))));
		model.addElement(new ComboBoxItem("XF100", res.getString("FunctionTypeXF100"), new ImageIcon(xeadEditor.Editor.class.getResource("ifnc100.png"))));
		model.addElement(new ComboBoxItem("XF110", res.getString("FunctionTypeXF110"), new ImageIcon(xeadEditor.Editor.class.getResource("ifnc110.png"))));
		model.addElement(new ComboBoxItem("XF200", res.getString("FunctionTypeXF200"), new ImageIcon(xeadEditor.Editor.class.getResource("ifnc200.png"))));
		model.addElement(new ComboBoxItem("XF210", res.getString("FunctionTypeXF210"), new ImageIcon(xeadEditor.Editor.class.getResource("ifnc210.png"))));
		model.addElement(new ComboBoxItem("XF290", res.getString("FunctionTypeXF290"), new ImageIcon(xeadEditor.Editor.class.getResource("ifnc290.png"))));
		model.addElement(new ComboBoxItem("XF300", res.getString("FunctionTypeXF300"), new ImageIcon(xeadEditor.Editor.class.getResource("ifnc300.png"))));
		model.addElement(new ComboBoxItem("XF310", res.getString("FunctionTypeXF310"), new ImageIcon(xeadEditor.Editor.class.getResource("ifnc310.png"))));
		model.addElement(new ComboBoxItem("XF390", res.getString("FunctionTypeXF390"), new ImageIcon(xeadEditor.Editor.class.getResource("ifnc390.png"))));
        jComboBoxType.setModel(model);
		jComboBoxType.setMaximumRowCount(model.getSize());
        jComboBoxType.setRenderer(new ComboBoxItemRenderer());
        //
		jTextFieldType.setFont(new java.awt.Font("Dialog", 0, 12));
		jTextFieldType.setBounds(new Rectangle(105, 37, 180, 21));
		jTextFieldType.setEditable(false);
		defaultMargin = jTextFieldType.getMargin();
		jLabelName.setText(res.getString("FunctionName"));
		jLabelName.setFont(new java.awt.Font("Dialog", 0, 12));
		jLabelName.setHorizontalAlignment(SwingConstants.RIGHT);
		jLabelName.setHorizontalTextPosition(SwingConstants.LEADING);
		jLabelName.setBounds(new Rectangle(11, 68, 89, 15));
		jTextFieldName.setFont(new java.awt.Font("Dialog", 0, 12));
		jTextFieldName.setBounds(new Rectangle(105, 65, 300, 22));
		//
		jLabelTableID.setText(res.getString("PrimaryTable"));
		jLabelTableID.setFont(new java.awt.Font("Dialog", 0, 12));
		jLabelTableID.setHorizontalAlignment(SwingConstants.RIGHT);
		jLabelTableID.setHorizontalTextPosition(SwingConstants.LEADING);
		jLabelTableID.setBounds(new Rectangle(11, 96, 89, 15));
		jTextFieldTableID.setFont(new java.awt.Font("Dialog", 0, 12));
		jTextFieldTableID.setBounds(new Rectangle(105, 93, 70, 22));
		jTextFieldTableID.addKeyListener(new DialogAddFunction_jTextFieldTableID_keyAdapter(this));
		jLabelTableName.setFont(new java.awt.Font("Dialog", 0, 12));
		jLabelTableName.setBounds(new Rectangle(180, 96, 150, 15));
		jLabelTableKeys.setText(res.getString("Keys"));
		jLabelTableKeys.setFont(new java.awt.Font("Dialog", 0, 12));
		jLabelTableKeys.setHorizontalAlignment(SwingConstants.RIGHT);
		jLabelTableKeys.setHorizontalTextPosition(SwingConstants.LEADING);
		jLabelTableKeys.setBounds(new Rectangle(11, 124, 89, 15));
		jTextFieldTableKeys.setFont(new java.awt.Font("Dialog", 0, 12));
		jTextFieldTableKeys.setBounds(new Rectangle(105, 121, 300, 22));
		jTextFieldTableKeys.setEditable(false);
		jTextFieldTableKeys.setFocusable(false);
		jButtonTableKeysEdit.setFont(new java.awt.Font("SansSerif", 0, 12));
		jButtonTableKeysEdit.setText("...");
		jButtonTableKeysEdit.setBounds(new Rectangle(405, 120, 28, 23));
		jButtonTableKeysEdit.addActionListener(new DialogAddFunction_jButtonTableKeysEdit_actionAdapter(this));
		//
		jLabelHeaderTableID.setText(res.getString("HDRTable"));
		jLabelHeaderTableID.setFont(new java.awt.Font("Dialog", 0, 12));
		jLabelHeaderTableID.setHorizontalAlignment(SwingConstants.RIGHT);
		jLabelHeaderTableID.setHorizontalTextPosition(SwingConstants.LEADING);
		jLabelHeaderTableID.setBounds(new Rectangle(5, 96, 95, 15));
		jTextFieldHeaderTableID.setFont(new java.awt.Font("Dialog", 0, 12));
		jTextFieldHeaderTableID.setBounds(new Rectangle(105, 93, 70, 22));
		jTextFieldHeaderTableID.addKeyListener(new DialogAddFunction_jTextFieldHeaderTableID_keyAdapter(this));
		jLabelHeaderTableName.setFont(new java.awt.Font("Dialog", 0, 12));
		jLabelHeaderTableName.setBounds(new Rectangle(180, 96, 150, 15));
		jLabelHeaderTableKeys.setText(res.getString("HDRTableKeys"));
		jLabelHeaderTableKeys.setFont(new java.awt.Font("Dialog", 0, 12));
		jLabelHeaderTableKeys.setHorizontalAlignment(SwingConstants.RIGHT);
		jLabelHeaderTableKeys.setHorizontalTextPosition(SwingConstants.LEADING);
		jLabelHeaderTableKeys.setBounds(new Rectangle(11, 124, 89, 15));
		jTextFieldHeaderTableKeys.setFont(new java.awt.Font("Dialog", 0, 12));
		jTextFieldHeaderTableKeys.setBounds(new Rectangle(105, 121, 300, 22));
		jTextFieldHeaderTableKeys.setEditable(false);
		jTextFieldHeaderTableKeys.setFocusable(false);
		jButtonHeaderTableKeysEdit.setFont(new java.awt.Font("SansSerif", 0, 12));
		jButtonHeaderTableKeysEdit.setText("...");
		jButtonHeaderTableKeysEdit.setBounds(new Rectangle(405, 120, 28, 23));
		jButtonHeaderTableKeysEdit.addActionListener(new DialogAddFunction_jButtonHeaderTableKeysEdit_actionAdapter(this));
		jLabelDetailTableID.setText(res.getString("DTLTable"));
		jLabelDetailTableID.setFont(new java.awt.Font("Dialog", 0, 12));
		jLabelDetailTableID.setHorizontalAlignment(SwingConstants.RIGHT);
		jLabelDetailTableID.setHorizontalTextPosition(SwingConstants.LEADING);
		jLabelDetailTableID.setBounds(new Rectangle(11, 152, 89, 15));
		jTextFieldDetailTableID.setFont(new java.awt.Font("Dialog", 0, 12));
		jTextFieldDetailTableID.setBounds(new Rectangle(105, 149, 70, 22));
		jTextFieldDetailTableID.addKeyListener(new DialogAddFunction_jTextFieldDetailTableID_keyAdapter(this));
		jLabelDetailTableName.setFont(new java.awt.Font("Dialog", 0, 12));
		jLabelDetailTableName.setBounds(new Rectangle(180, 152, 150, 15));
		jLabelDetailTableKeys.setText(res.getString("DTLTableKeys"));
		jLabelDetailTableKeys.setFont(new java.awt.Font("Dialog", 0, 12));
		jLabelDetailTableKeys.setHorizontalAlignment(SwingConstants.RIGHT);
		jLabelDetailTableKeys.setHorizontalTextPosition(SwingConstants.LEADING);
		jLabelDetailTableKeys.setBounds(new Rectangle(11, 180, 89, 15));
		jTextFieldDetailTableKeys.setFont(new java.awt.Font("Dialog", 0, 12));
		jTextFieldDetailTableKeys.setBounds(new Rectangle(105, 177, 300, 22));
		jTextFieldDetailTableKeys.setEditable(false);
		jTextFieldDetailTableKeys.setFocusable(false);
		jButtonDetailTableKeysEdit.setFont(new java.awt.Font("SansSerif", 0, 12));
		jButtonDetailTableKeysEdit.setText("...");
		jButtonDetailTableKeysEdit.setBounds(new Rectangle(405, 176, 28, 23));
		jButtonDetailTableKeysEdit.addActionListener(new DialogAddFunction_jButtonDetailTableKeysEdit_actionAdapter(this));
		//
		this.setTitle(res.getString("AddFunction"));
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(jPanelButtons,  BorderLayout.SOUTH);
		this.getContentPane().add(jPanelCenter,  BorderLayout.CENTER);
		this.setResizable(false);
		this.pack();
	}
	//
	public int request(String subsystemID) {
		subsystemID_ = subsystemID;
		returnCode = 0;
		//
		element = null;
		jTextFieldID.setText("");
		jTextFieldID.requestFocus();
		jTextFieldID.setEditable(true);
		jTextFieldName.setText("");
		jTextFieldName.setEditable(true);
		jComboBoxType.setSelectedIndex(0);
		//
		jPanelCenter.removeAll();
		jPanelCenter.add(jLabelID);
		jPanelCenter.add(jTextFieldID);
		jPanelCenter.add(jLabelType);
		jPanelCenter.add(jComboBoxType);
		jPanelCenter.add(jLabelName);
		jPanelCenter.add(jTextFieldName);
		//
		jPanelButtons.removeAll();
		jPanelButtons.add(jButtonNext);
		jPanelButtons.add(jButtonCancel);
		jPanelButtons.getRootPane().setDefaultButton(jButtonNext);
		//
		this.setSize(new Dimension(450, 171));
		Dimension dlgSize = this.getSize();
		Dimension frmSize = frame_.getSize();
		Point loc = frame_.getLocation();
		this.setLocation((frmSize.width - dlgSize.width) / 2 + loc.x, (frmSize.height - dlgSize.height) / 2 + loc.y);
		//
		super.setVisible(true);
		//
		return returnCode;
	}
	//
	public org.w3c.dom.Element getNewElement() {
		return element;
	}
	//
	void jButtonNext_actionPerformed(ActionEvent e) {
		boolean duplicated = false;
		MainTreeNode childNode1, childNode2, childNode3;
		String functionType = "";
		//
		if (jTextFieldID.getText().equals("")) {
			JOptionPane.showMessageDialog(this, res.getString("ErrorMessage78"));
			jTextFieldID.requestFocus();
		} else {
			if (jComboBoxType.getSelectedIndex() == 0) {
				JOptionPane.showMessageDialog(this, res.getString("ErrorMessage79"));
				jComboBoxType.requestFocus();
			} else {
				if (jTextFieldName.getText().equals("")) {
					JOptionPane.showMessageDialog(this, res.getString("ErrorMessage80"));
					jTextFieldName.requestFocus();
				} else {
					for (int i = 0; i < frame_.getSubsystemListNode().getChildCount(); i++) {
						childNode1 = (MainTreeNode)frame_.getSubsystemListNode().getChildAt(i);
						childNode2 = (MainTreeNode)childNode1.getChildAt(1); //SubsystemFunctionList//
						for (int j = 0; j < childNode2.getChildCount(); j++) {
							childNode3 = (MainTreeNode)childNode2.getChildAt(j);
							if (childNode3.getElement().getAttribute("ID").equals(jTextFieldID.getText().toUpperCase())) {
								duplicated = true;
								break;
							}
						}
						if (duplicated) {
							break;
						}
					}
					if (duplicated) {
						JOptionPane.showMessageDialog(null, res.getString("ErrorMessage81"));
						jTextFieldID.requestFocus();
					} else {
						jTextFieldType.removeAll();
						ComboBoxItem item = (ComboBoxItem)jComboBoxType.getSelectedItem();
						functionType = item.getID();
						jTextFieldType.setText(item.getName());
						jTextFieldType.setMargin(new Insets(defaultMargin.top, defaultMargin.left+item.getIcon().getIconWidth()+2, defaultMargin.bottom, defaultMargin.right)); 
						JLabel label = new JLabel(item.getIcon());
						label.setBorder(null); 
						label.setBounds(defaultMargin.left, defaultMargin.top, item.getIcon().getIconWidth(), item.getIcon().getIconHeight()); 
						jTextFieldType.add(label);
						//
						jTextFieldID.setText(jTextFieldID.getText().toUpperCase());
						jTextFieldID.setEditable(false);
						jTextFieldName.setEditable(false);
						jComboBoxType.setEditable(false);
						//
						jPanelCenter.removeAll();
						jPanelCenter.add(jLabelID, null);
						jPanelCenter.add(jTextFieldID, null);
						jPanelCenter.add(jLabelType, null);
						jPanelCenter.add(jTextFieldType, null);
						jPanelCenter.add(jLabelName, null);
						jPanelCenter.add(jTextFieldName, null);
						//
						jPanelButtons.removeAll();
						jPanelButtons.add(jButtonCancel, null);
						jPanelButtons.add(jButtonOK, null);
						//
						if (functionType.equals("XF000")) {
							jButtonOK_actionPerformed(null);
						}
						//
						if (functionType.equals("XF010")
								|| functionType.equals("XF100")
								|| functionType.equals("XF110")
								|| functionType.equals("XF200")
								|| functionType.equals("XF210")
								|| functionType.equals("XF290")) {
							jTextFieldTableID.setText("");
							jLabelTableName.setText("");
							jTextFieldTableKeys.setText("*Keys");
							jButtonTableKeysEdit.setEnabled(false);
							jPanelCenter.add(jLabelTableID, null);
							jPanelCenter.add(jTextFieldTableID, null);
							jPanelCenter.add(jLabelTableName, null);
							jPanelCenter.add(jLabelTableKeys, null);
							jPanelCenter.add(jTextFieldTableKeys, null);
							jPanelCenter.add(jButtonTableKeysEdit, null);
							tableNode = null;
							tableKeys = "";
							this.setSize(new Dimension(450, 227));
							jButtonOK.setEnabled(false);
							jTextFieldTableID.requestFocus();
						}
						if (functionType.equals("XF300")
								|| functionType.equals("XF310")
								|| functionType.equals("XF390")) {
							jTextFieldHeaderTableID.setText("");
							jTextFieldHeaderTableKeys.setText("*Keys");
							headerTableNode = null;
							headerTableKeys = "";
							jTextFieldDetailTableID.setText("");
							jTextFieldDetailTableKeys.setText("*Keys");
							detailTableNode = null;
							detailTableKeys = "";
							jPanelCenter.add(jLabelHeaderTableID, null);
							jPanelCenter.add(jTextFieldHeaderTableID, null);
							jPanelCenter.add(jLabelHeaderTableName, null);
							jPanelCenter.add(jLabelHeaderTableKeys, null);
							jPanelCenter.add(jTextFieldHeaderTableKeys, null);
							jPanelCenter.add(jButtonHeaderTableKeysEdit, null);
							jPanelCenter.add(jLabelDetailTableID, null);
							jPanelCenter.add(jTextFieldDetailTableID, null);
							jPanelCenter.add(jLabelDetailTableName, null);
							jPanelCenter.add(jLabelDetailTableKeys, null);
							jPanelCenter.add(jTextFieldDetailTableKeys, null);
							jPanelCenter.add(jButtonDetailTableKeysEdit, null);
							this.setSize(new Dimension(450, 283));
							jButtonOK.setEnabled(false);
							jTextFieldHeaderTableID.requestFocus();
						}
						//
						//jPanelButtons.removeAll();
						//jPanelButtons.add(jButtonCancel, null);
						//jPanelButtons.add(jButtonOK, null);
						//this.getRootPane().setDefaultButton(jButtonOK);
					}
				}
			}
		}
	}
	//
	void jButtonOK_actionPerformed(ActionEvent e) {
		org.w3c.dom.Element workElement, childElement, grandChildElement;
		boolean noErrors = true;
		//
		ComboBoxItem item = (ComboBoxItem)jComboBoxType.getSelectedItem();
		String functionType = item.getID();
		//
		if (functionType.equals("XF010")
			|| functionType.equals("XF100")
			|| functionType.equals("XF110")
			|| functionType.equals("XF200")
			|| functionType.equals("XF210")
			|| functionType.equals("XF290")) {
			//
			String keyFieldIDs = "";
			org.w3c.dom.Element tablePKElement = frame_.getSpecificPKElement(jTextFieldTableID.getText());
			if (tablePKElement != null) {
				keyFieldIDs = tablePKElement.getAttribute("Fields");
			}
			if (tablePKElement == null || keyFieldIDs.equals("")) {
				JOptionPane.showMessageDialog(this.getContentPane(), res.getString("ErrorMessage82"));
				noErrors = false;
			}
		}
		//
		if (functionType.equals("XF300")
			|| functionType.equals("XF310")
			|| functionType.equals("XF390")) {
			//
			String keyFieldIDs = "";
			org.w3c.dom.Element tablePKElement = frame_.getSpecificPKElement(jTextFieldHeaderTableID.getText());
			if (tablePKElement != null) {
				keyFieldIDs = tablePKElement.getAttribute("Fields");
			}
			if (tablePKElement == null || keyFieldIDs.equals("")) {
				JOptionPane.showMessageDialog(this.getContentPane(), res.getString("ErrorMessage83"));
				noErrors = false;
			}
			//
			keyFieldIDs = "";
			tablePKElement = frame_.getSpecificPKElement(jTextFieldDetailTableID.getText());
			if (tablePKElement != null) {
				keyFieldIDs = tablePKElement.getAttribute("Fields");
			}
			if (tablePKElement == null || keyFieldIDs.equals("")) {
				JOptionPane.showMessageDialog(this.getContentPane(), res.getString("ErrorMessage84"));
				noErrors = false;
			}
		}
		//
		if (noErrors) {
			//
			element = frame_.getDomDocument().createElement("Function");
			element.setAttribute("Type", functionType);
			element.setAttribute("ID", jTextFieldID.getText());
			element.setAttribute("Name", jTextFieldName.getText());
			element.setAttribute("SubsystemID", subsystemID_);
			//
			if (functionType.equals("XF000")) {
				element.setAttribute("Script", "");
			}
			//
			if (functionType.equals("XF010")) {
				element.setAttribute("PrimaryTable", jTextFieldTableID.getText());
				element.setAttribute("KeyFields", tableKeys);
				element.setAttribute("Script", "");
				//
				NodeList nodeList = tableNode.getElement().getElementsByTagName("Field");
				sortingList = frame_.getSortedListModel(nodeList, "Order");
				for (int i = 0; i < sortingList.getSize(); i++) {
					if (i < 5) {
						workElement = (org.w3c.dom.Element)sortingList.getElementAt(i);
						childElement = frame_.getDomDocument().createElement("Field");
						childElement.setAttribute("Order", frame_.getFormatted4ByteString(i * 10));
						childElement.setAttribute("DataSource", jTextFieldTableID.getText() + "." + workElement.getAttribute("ID")); 
						element.appendChild(childElement);
					} else {
						break;
					}
				}
			}
			//
			if (functionType.equals("XF100")) {
				element.setAttribute("PrimaryTable", jTextFieldTableID.getText());
				element.setAttribute("KeyFields", tableKeys);
				element.setAttribute("OrderBy", "");
				element.setAttribute("DetailFunction", "XXXXXX");
				element.setAttribute("Size", "");
				element.setAttribute("InitialMsg", "");
				//
				NodeList nodeList = tableNode.getElement().getElementsByTagName("Field");
				sortingList = frame_.getSortedListModel(nodeList, "Order");
				for (int i = 0; i < sortingList.getSize(); i++) {
					if (i < 5) {
						workElement = (org.w3c.dom.Element)sortingList.getElementAt(i);
						childElement = frame_.getDomDocument().createElement("Column");
						childElement.setAttribute("Order", frame_.getFormatted4ByteString(i * 10));
						childElement.setAttribute("DataSource", jTextFieldTableID.getText() + "." + workElement.getAttribute("ID")); 
						childElement.setAttribute("FieldOptions", "");
						element.appendChild(childElement);
					} else {
						break;
					}
				}
				//
				childElement = frame_.getDomDocument().createElement("Button");
				childElement.setAttribute("Position", "0");
				childElement.setAttribute("Number", "3");
				childElement.setAttribute("Caption", res.getString("Close"));
				childElement.setAttribute("Action", "EXIT");
				element.appendChild(childElement);
				childElement = frame_.getDomDocument().createElement("Button");
				childElement.setAttribute("Position", "3");
				childElement.setAttribute("Number", "6");
				childElement.setAttribute("Caption", res.getString("Add"));
				childElement.setAttribute("Action", "ADD");
				element.appendChild(childElement);
				childElement = frame_.getDomDocument().createElement("Button");
				childElement.setAttribute("Position", "6");
				childElement.setAttribute("Number", "12");
				childElement.setAttribute("Caption", res.getString("Output"));
				childElement.setAttribute("Action", "OUTPUT");
				element.appendChild(childElement);
			}
			//
			if (functionType.equals("XF110")) {
				element.setAttribute("PrimaryTable", jTextFieldTableID.getText());
				element.setAttribute("KeyFields", tableKeys);
				element.setAttribute("OrderBy", "");
				element.setAttribute("BatchTable", "");
				element.setAttribute("BatchKeyFields", "");
				element.setAttribute("BatchWithKeyFields", "");
				element.setAttribute("Size", "");
				element.setAttribute("InitialMsg", "");
				//
				NodeList nodeList = tableNode.getElement().getElementsByTagName("Field");
				sortingList = frame_.getSortedListModel(nodeList, "Order");
				for (int i = 0; i < sortingList.getSize(); i++) {
					if (i < 5) {
						workElement = (org.w3c.dom.Element)sortingList.getElementAt(i);
						childElement = frame_.getDomDocument().createElement("Column");
						childElement.setAttribute("Order", frame_.getFormatted4ByteString(i * 10));
						childElement.setAttribute("DataSource", jTextFieldTableID.getText() + "." + workElement.getAttribute("ID")); 
						childElement.setAttribute("FieldOptions", "");
						element.appendChild(childElement);
					} else {
						break;
					}
				}
				//
				childElement = frame_.getDomDocument().createElement("Button");
				childElement.setAttribute("Position", "0");
				childElement.setAttribute("Number", "3");
				childElement.setAttribute("Caption", res.getString("Close"));
				childElement.setAttribute("Action", "EXIT");
				element.appendChild(childElement);
				childElement = frame_.getDomDocument().createElement("Button");
				childElement.setAttribute("Position", "2");
				childElement.setAttribute("Number", "4");
				childElement.setAttribute("Caption", res.getString("Previous"));
				childElement.setAttribute("Action", "PREV");
				element.appendChild(childElement);
				childElement = frame_.getDomDocument().createElement("Button");
				childElement.setAttribute("Position", "4");
				childElement.setAttribute("Number", "5");
				childElement.setAttribute("Caption", res.getString("Next"));
				childElement.setAttribute("Action", "NEXT");
				element.appendChild(childElement);
				childElement = frame_.getDomDocument().createElement("Button");
				childElement.setAttribute("Position", "4");
				childElement.setAttribute("Number", "5");
				childElement.setAttribute("Caption", res.getString("Update"));
				childElement.setAttribute("Action", "UPDATE");
				element.appendChild(childElement);
				childElement = frame_.getDomDocument().createElement("Button");
				childElement.setAttribute("Position", "6");
				childElement.setAttribute("Number", "12");
				childElement.setAttribute("Caption", res.getString("Output"));
				childElement.setAttribute("Action", "OUTPUT");
				element.appendChild(childElement);
			}
			//
			if (functionType.equals("XF200")) {
				element.setAttribute("PrimaryTable", jTextFieldTableID.getText());
				element.setAttribute("KeyFields", tableKeys);
				element.setAttribute("Size", "AUTO");
				element.setAttribute("InitialMsg", "");
				//
				NodeList nodeList = tableNode.getElement().getElementsByTagName("Field");
				sortingList = frame_.getSortedListModel(nodeList, "Order");
				for (int i = 0; i < sortingList.getSize(); i++) {
					workElement = (org.w3c.dom.Element)sortingList.getElementAt(i);
					childElement = frame_.getDomDocument().createElement("Field");
					childElement.setAttribute("Order", frame_.getFormatted4ByteString(i * 10));
					childElement.setAttribute("DataSource", jTextFieldTableID.getText() + "." + workElement.getAttribute("ID")); 
					childElement.setAttribute("FieldOptions", "");
					element.appendChild(childElement);
				}
				//
				childElement = frame_.getDomDocument().createElement("Button");
				childElement.setAttribute("Position", "0");
				childElement.setAttribute("Number", "3");
				childElement.setAttribute("Caption", res.getString("Close"));
				childElement.setAttribute("Action", "EXIT");
				element.appendChild(childElement);
				childElement = frame_.getDomDocument().createElement("Button");
				childElement.setAttribute("Position", "2");
				childElement.setAttribute("Number", "5");
				childElement.setAttribute("Caption", res.getString("Edit"));
				childElement.setAttribute("Action", "EDIT");
				element.appendChild(childElement);
				childElement = frame_.getDomDocument().createElement("Button");
				childElement.setAttribute("Position", "3");
				childElement.setAttribute("Number", "7");
				childElement.setAttribute("Caption", res.getString("Copy"));
				childElement.setAttribute("Action", "COPY");
				element.appendChild(childElement);
				childElement = frame_.getDomDocument().createElement("Button");
				childElement.setAttribute("Position", "4");
				childElement.setAttribute("Number", "9");
				childElement.setAttribute("Caption", res.getString("Delete"));
				childElement.setAttribute("Action", "DELETE");
				element.appendChild(childElement);
				childElement = frame_.getDomDocument().createElement("Button");
				childElement.setAttribute("Position", "6");
				childElement.setAttribute("Number", "12");
				childElement.setAttribute("Caption", res.getString("Output"));
				childElement.setAttribute("Action", "OUTPUT");
				element.appendChild(childElement);
			}
			//
			if (functionType.equals("XF210")) {
				element.setAttribute("PrimaryTable", jTextFieldTableID.getText());
				element.setAttribute("KeyFields", tableKeys);
				element.setAttribute("Size", "AUTO");
				element.setAttribute("InitialMsg", "");
				//
				NodeList nodeList = tableNode.getElement().getElementsByTagName("Field");
				sortingList = frame_.getSortedListModel(nodeList, "Order");
				for (int i = 0; i < sortingList.getSize(); i++) {
					workElement = (org.w3c.dom.Element)sortingList.getElementAt(i);
					childElement = frame_.getDomDocument().createElement("Field");
					childElement.setAttribute("Order", frame_.getFormatted4ByteString(i * 10));
					childElement.setAttribute("DataSource", jTextFieldTableID.getText() + "." + workElement.getAttribute("ID")); 
					childElement.setAttribute("FieldOptions", "");
					element.appendChild(childElement);
				}
				//
				childElement = frame_.getDomDocument().createElement("Button");
				childElement.setAttribute("Position", "0");
				childElement.setAttribute("Number", "3");
				childElement.setAttribute("Caption", res.getString("Close"));
				childElement.setAttribute("Action", "EXIT");
				element.appendChild(childElement);
				childElement = frame_.getDomDocument().createElement("Button");
				childElement.setAttribute("Position", "2");
				childElement.setAttribute("Number", "5");
				childElement.setAttribute("Caption", res.getString("Update"));
				childElement.setAttribute("Action", "UPDATE");
				element.appendChild(childElement);
				childElement = frame_.getDomDocument().createElement("Button");
				childElement.setAttribute("Position", "6");
				childElement.setAttribute("Number", "12");
				childElement.setAttribute("Caption", res.getString("Output"));
				childElement.setAttribute("Action", "OUTPUT");
				element.appendChild(childElement);
			}
			//
			if (functionType.equals("XF290")) {
				element.setAttribute("PrimaryTable", jTextFieldTableID.getText());
				element.setAttribute("KeyFields", tableKeys);
				element.setAttribute("PageSize", "A4");
				element.setAttribute("Direction", "");
				element.setAttribute("Margins", "50;50;50;50");
				element.setAttribute("WithPageNumber", "F");
				//
				//Get Default Font ID//
				org.w3c.dom.Element fontElement;
				String defaultFontID = "";
				NodeList fontList = frame_.getDomDocument().getElementsByTagName("PrintFont");
				sortingList = frame_.getSortedListModel(fontList, "FontName");
				for (int i = 0; i < sortingList.getSize(); i++) {
					fontElement = (org.w3c.dom.Element)sortingList.getElementAt(i);
					defaultFontID = fontElement.getAttribute("ID");
					break;
				}
				//
				childElement = frame_.getDomDocument().createElement("Phrase");
				childElement.setAttribute("Order", "0000");
				childElement.setAttribute("Block", "HEADER");
				childElement.setAttribute("Value", "&Text(" + jTextFieldName.getText() + ")");
				childElement.setAttribute("Alignment", "CENTER");
				childElement.setAttribute("FontID", defaultFontID);
				childElement.setAttribute("FontSize", "15");
				childElement.setAttribute("FontStyle", "BOLD");
				element.appendChild(childElement);
				//
				NodeList nodeList = tableNode.getElement().getElementsByTagName("Field");
				sortingList = frame_.getSortedListModel(nodeList, "Order");
				for (int i = 0; i < sortingList.getSize(); i++) {
					if (i < 5) {
						workElement = (org.w3c.dom.Element)sortingList.getElementAt(i);
						childElement = frame_.getDomDocument().createElement("Phrase");
						childElement.setAttribute("Order", frame_.getFormatted4ByteString((i+1) * 10));
						childElement.setAttribute("Block", "PARAGRAPH");
						childElement.setAttribute("Value", "&DataSource(" + jTextFieldTableID.getText() + "." + workElement.getAttribute("ID") + ")"); 
						childElement.setAttribute("Alignment", "LEFT");
						childElement.setAttribute("AlignmentMargin", "0");
						childElement.setAttribute("FontID", defaultFontID);
						childElement.setAttribute("FontSize", "12");
						childElement.setAttribute("FontStyle", "");
						element.appendChild(childElement);
					} else {
						break;
					}
				}
			}
			//
			if (functionType.equals("XF300")) {
				//
				noErrors = checkErrorOfDetailTableKeys();
				if (noErrors) {
					element.setAttribute("HeaderTable", jTextFieldHeaderTableID.getText());
					element.setAttribute("HeaderKeyFields", "");
					element.setAttribute("HeaderFunction", "xxxxxx");
					element.setAttribute("Size", "");
					//
					NodeList nodeList = headerTableNode.getElement().getElementsByTagName("Field");
					sortingList = frame_.getSortedListModel(nodeList, "Order");
					for (int i = 0; i < sortingList.getSize(); i++) {
						if (i < 7) {
							workElement = (org.w3c.dom.Element)sortingList.getElementAt(i);
							childElement = frame_.getDomDocument().createElement("Field");
							childElement.setAttribute("Order", frame_.getFormatted4ByteString(i * 10));
							childElement.setAttribute("DataSource", jTextFieldHeaderTableID.getText() + "." + workElement.getAttribute("ID")); 
							childElement.setAttribute("FieldOptions", "");
							element.appendChild(childElement);
						} else {
							break;
						}
					}
					//
					childElement = frame_.getDomDocument().createElement("Detail");
					childElement.setAttribute("Order", "0010");
					childElement.setAttribute("Table", jTextFieldDetailTableID.getText());
					childElement.setAttribute("HeaderKeyFields", headerTableKeys);
					childElement.setAttribute("KeyFields", detailTableKeys);
					childElement.setAttribute("DetailFunction", "XXXXX");
					childElement.setAttribute("Caption", detailTableNode.getElement().getAttribute("Name"));
					childElement.setAttribute("InitialMsg", "");
					element.appendChild(childElement);
					//
					boolean isNotHeaderKey;
					int columnCount = 0;
					nodeList = detailTableNode.getElement().getElementsByTagName("Field");
					sortingList = frame_.getSortedListModel(nodeList, "Order");
					for (int i = 0; i < sortingList.getSize(); i++) {
						if (columnCount < 5) {
							workElement = (org.w3c.dom.Element)sortingList.getElementAt(i);
							isNotHeaderKey = true;
							for (int j = 0; j < headerKeyList.size(); j++) {
								if (workElement.getAttribute("ID").equals(detailKeyList.get(j))) {
									isNotHeaderKey = false;
									break;
								}
							}
							if (isNotHeaderKey) {
								grandChildElement = frame_.getDomDocument().createElement("Column");
								grandChildElement.setAttribute("Order", frame_.getFormatted4ByteString(columnCount * 10));
								grandChildElement.setAttribute("DataSource", jTextFieldDetailTableID.getText() + "." + workElement.getAttribute("ID")); 
								grandChildElement.setAttribute("FieldOptions", "");
								childElement.appendChild(grandChildElement);
								columnCount++;
							}
						} else {
							break;
						}
					}
					//
					grandChildElement = frame_.getDomDocument().createElement("Button");
					grandChildElement.setAttribute("Position", "0");
					grandChildElement.setAttribute("Number", "3");
					grandChildElement.setAttribute("Caption", res.getString("Close"));
					grandChildElement.setAttribute("Action", "EXIT");
					childElement.appendChild(grandChildElement);
					grandChildElement = frame_.getDomDocument().createElement("Button");
					grandChildElement.setAttribute("Position", "3");
					grandChildElement.setAttribute("Number", "6");
					grandChildElement.setAttribute("Caption", res.getString("Add"));
					grandChildElement.setAttribute("Action", "ADD");
					childElement.appendChild(grandChildElement);
					grandChildElement = frame_.getDomDocument().createElement("Button");
					grandChildElement.setAttribute("Position", "4");
					grandChildElement.setAttribute("Number", "8");
					grandChildElement.setAttribute("Caption", res.getString("HDRData"));
					grandChildElement.setAttribute("Action", "HEADER");
					childElement.appendChild(grandChildElement);
					grandChildElement = frame_.getDomDocument().createElement("Button");
					grandChildElement.setAttribute("Position", "6");
					grandChildElement.setAttribute("Number", "12");
					grandChildElement.setAttribute("Caption", res.getString("Output"));
					grandChildElement.setAttribute("Action", "OUTPUT");
					childElement.appendChild(grandChildElement);
				}
			}
			//
			if (functionType.equals("XF310")) {
				//
				noErrors = checkErrorOfDetailTableKeys();
				if (noErrors) {
					element.setAttribute("HeaderTable", jTextFieldHeaderTableID.getText());
					element.setAttribute("HeaderKeyFields", headerTableKeys);
					element.setAttribute("DetailTable", jTextFieldDetailTableID.getText());
					element.setAttribute("DetailKeyFields", detailTableKeys);
					element.setAttribute("DetailRowNo", detailRowNoID);
					if (detailRowNoID.equals("")) {
						element.setAttribute("AddBlankRowAllowed", "F");
					} else {
						element.setAttribute("AddBlankRowAllowed", "T");
					}
					element.setAttribute("Size", "");
					//
					NodeList nodeList = headerTableNode.getElement().getElementsByTagName("Field");
					sortingList = frame_.getSortedListModel(nodeList, "Order");
					for (int i = 0; i < sortingList.getSize(); i++) {
						if (i < 7) {
							workElement = (org.w3c.dom.Element)sortingList.getElementAt(i);
							childElement = frame_.getDomDocument().createElement("Field");
							childElement.setAttribute("Order", frame_.getFormatted4ByteString(i * 10));
							childElement.setAttribute("DataSource", jTextFieldHeaderTableID.getText() + "." + workElement.getAttribute("ID")); 
							childElement.setAttribute("FieldOptions", "");
							element.appendChild(childElement);
						} else {
							break;
						}
					}
					//
					boolean isNotHeaderKey;
					int columnCount = 0;
					nodeList = detailTableNode.getElement().getElementsByTagName("Field");
					sortingList = frame_.getSortedListModel(nodeList, "Order");
					for (int i = 0; i < sortingList.getSize(); i++) {
						if (columnCount < 5) {
							workElement = (org.w3c.dom.Element)sortingList.getElementAt(i);
							isNotHeaderKey = true;
							for (int j = 0; j < headerKeyList.size(); j++) {
								if (workElement.getAttribute("ID").equals(detailKeyList.get(j))) {
									isNotHeaderKey = false;
									break;
								}
							}
							if (isNotHeaderKey) {
								childElement = frame_.getDomDocument().createElement("Column");
								childElement.setAttribute("Order", frame_.getFormatted4ByteString(columnCount * 10));
								childElement.setAttribute("DataSource", jTextFieldDetailTableID.getText() + "." + workElement.getAttribute("ID")); 
								childElement.setAttribute("FieldOptions", "");
								element.appendChild(childElement);
								columnCount++;
							}
						} else {
							break;
						}
					}
					//
					childElement = frame_.getDomDocument().createElement("Button");
					childElement.setAttribute("Position", "0");
					childElement.setAttribute("Number", "3");
					childElement.setAttribute("Caption", res.getString("Close"));
					childElement.setAttribute("Action", "EXIT");
					element.appendChild(childElement);
					childElement = frame_.getDomDocument().createElement("Button");
					childElement.setAttribute("Position", "2");
					childElement.setAttribute("Number", "5");
					childElement.setAttribute("Caption", res.getString("Update"));
					childElement.setAttribute("Action", "UPDATE");
					element.appendChild(childElement);
					childElement = frame_.getDomDocument().createElement("Button");
					childElement.setAttribute("Position", "4");
					childElement.setAttribute("Number", "6");
					childElement.setAttribute("Caption", res.getString("AddRow"));
					childElement.setAttribute("Action", "ADD_ROW");
					element.appendChild(childElement);
					childElement = frame_.getDomDocument().createElement("Button");
					childElement.setAttribute("Position", "5");
					childElement.setAttribute("Number", "9");
					childElement.setAttribute("Caption", res.getString("RemoveRow"));
					childElement.setAttribute("Action", "REMOVE_ROW");
					element.appendChild(childElement);
					childElement = frame_.getDomDocument().createElement("Button");
					childElement.setAttribute("Position", "6");
					childElement.setAttribute("Number", "12");
					childElement.setAttribute("Caption", res.getString("Output"));
					childElement.setAttribute("Action", "OUTPUT");
					element.appendChild(childElement);
				}
			}
			//
			if (functionType.equals("XF390")) {
				//
				noErrors = checkErrorOfDetailTableKeys();
				if (noErrors) {
					//
					//Get Default Font ID//
					org.w3c.dom.Element fontElement;
					String defaultFontID = "";
					NodeList fontList = frame_.getDomDocument().getElementsByTagName("PrintFont");
					sortingList = frame_.getSortedListModel(fontList, "FontName");
					for (int i = 0; i < sortingList.getSize(); i++) {
						fontElement = (org.w3c.dom.Element)sortingList.getElementAt(i);
						defaultFontID = fontElement.getAttribute("ID");
						break;
					}
					//
					element.setAttribute("HeaderTable", jTextFieldHeaderTableID.getText());
					element.setAttribute("HeaderKeyFields", headerTableKeys);
					element.setAttribute("DetailTable", jTextFieldDetailTableID.getText());
					element.setAttribute("DetailKeyFields", detailTableKeys);
					element.setAttribute("PageSize", "A4");
					element.setAttribute("Direction", "");
					element.setAttribute("Margins", "50;50;50;50");
					element.setAttribute("WithPageNumber", "T");
					element.setAttribute("TableFontID", defaultFontID);
					element.setAttribute("TableFontSize", "9");
					element.setAttribute("TableRowNoWidth", "5");
					//
					childElement = frame_.getDomDocument().createElement("HeaderPhrase");
					childElement.setAttribute("Order", "0000");
					childElement.setAttribute("Block", "HEADER");
					childElement.setAttribute("Value", "&Text(" + jTextFieldName.getText() + ")");
					childElement.setAttribute("Alignment", "CENTER");
					childElement.setAttribute("FontID", defaultFontID);
					childElement.setAttribute("FontSize", "15");
					childElement.setAttribute("FontStyle", "BOLD");
					element.appendChild(childElement);
					//
					NodeList nodeList = headerTableNode.getElement().getElementsByTagName("Field");
					sortingList = frame_.getSortedListModel(nodeList, "Order");
					for (int i = 0; i < sortingList.getSize(); i++) {
						if (i < 5) {
							workElement = (org.w3c.dom.Element)sortingList.getElementAt(i);
							childElement = frame_.getDomDocument().createElement("HeaderPhrase");
							childElement.setAttribute("Order", frame_.getFormatted4ByteString((i+1) * 10));
							childElement.setAttribute("Block", "PARAGRAPH");
							childElement.setAttribute("Value", "&DataSource(" + jTextFieldHeaderTableID.getText() + "." + workElement.getAttribute("ID") + ")"); 
							childElement.setAttribute("Alignment", "LEFT");
							childElement.setAttribute("AlignmentMargin", "0");
							childElement.setAttribute("FontID", defaultFontID);
							childElement.setAttribute("FontSize", "12");
							childElement.setAttribute("FontStyle", "");
							element.appendChild(childElement);
						} else {
							break;
						}
					}
					//
					boolean isNotHeaderKey;
					int columnCount = 0;
					nodeList = detailTableNode.getElement().getElementsByTagName("Field");
					sortingList = frame_.getSortedListModel(nodeList, "Order");
					for (int i = 0; i < sortingList.getSize(); i++) {
						if (columnCount < 5) {
							workElement = (org.w3c.dom.Element)sortingList.getElementAt(i);
							isNotHeaderKey = true;
							for (int j = 0; j < headerKeyList.size(); j++) {
								if (workElement.getAttribute("ID").equals(detailKeyList.get(j))) {
									isNotHeaderKey = false;
									break;
								}
							}
							if (isNotHeaderKey) {
								childElement = frame_.getDomDocument().createElement("Column");
								childElement.setAttribute("Order", frame_.getFormatted4ByteString(columnCount * 10));
								childElement.setAttribute("DataSource", jTextFieldDetailTableID.getText() + "." + workElement.getAttribute("ID")); 
								childElement.setAttribute("FieldOptions", "");
								childElement.setAttribute("Width", "19");
								childElement.setAttribute("Alignment", "LEFT");
								element.appendChild(childElement);
								columnCount++;
							}
						} else {
							break;
						}
					}
				}
			}
		}
		//
		if (noErrors) {
			returnCode = 1;
			this.setVisible(false);
		}
	}
	//
	boolean checkErrorOfDetailTableKeys() {
		boolean noErrors = true;
		org.w3c.dom.Element workElement1, workElement2;
		StringTokenizer workTokenizer;
		int decimal1, decimal2;
		//
		String workHeaderTableKeys = headerTableKeys;
		if (workHeaderTableKeys.equals("")) {
			workElement1 = frame_.getSpecificPKElement(jTextFieldHeaderTableID.getText());
			workHeaderTableKeys = workElement1.getAttribute("Fields");
		}
		String workDetailTableKeys = detailTableKeys;
		if (workDetailTableKeys.equals("")) {
			workElement2 = frame_.getSpecificPKElement(jTextFieldDetailTableID.getText());
			workDetailTableKeys = workElement2.getAttribute("Fields");
		}
		//
		headerKeyList.clear();
		workTokenizer = new StringTokenizer(workHeaderTableKeys, ";" );
		while (workTokenizer.hasMoreTokens()) {
			headerKeyList.add(workTokenizer.nextToken());
		}
		detailKeyList.clear();
		workTokenizer = new StringTokenizer(workDetailTableKeys, ";" );
		while (workTokenizer.hasMoreTokens()) {
			detailKeyList.add(workTokenizer.nextToken());
		}
		//
		if (headerKeyList.size() == 0 ||  detailKeyList.size() == 0) {
			noErrors = false;
			JOptionPane.showMessageDialog(null, res.getString("ErrorMessage85"));
		} else {
			if (headerKeyList.size() >= detailKeyList.size()) {
				noErrors = false;
				JOptionPane.showMessageDialog(null, res.getString("ErrorMessage74"));
			} else {
				for (int i = 0; i < headerKeyList.size(); i++) {
					workElement1 = frame_.getSpecificFieldElement(jTextFieldHeaderTableID.getText(), headerKeyList.get(i));
					workElement2 = frame_.getSpecificFieldElement(jTextFieldDetailTableID.getText(), detailKeyList.get(i));
					decimal1 = 0;
					decimal2 = 0;
					if (!workElement1.getAttribute("Decimal").equals("")) {
						decimal1 = Integer.parseInt(workElement1.getAttribute("Decimal"));
					}
					if (!workElement2.getAttribute("Decimal").equals("")) {
						decimal2 = Integer.parseInt(workElement2.getAttribute("Decimal"));
					}
					if (!workElement1.getAttribute("Type").equals(workElement2.getAttribute("Type")) || !workElement1.getAttribute("Size").equals(workElement2.getAttribute("Size")) || decimal1 != decimal2) {
						noErrors = false;
						JOptionPane.showMessageDialog(null, res.getString("ErrorMessage77"));
						break;
					}
				}

			}
		}
		//
		detailRowNoID = "";
		if (noErrors) {
			int workInt = detailKeyList.size() - headerKeyList.size();
			if (workInt == 1) {
				workElement1 = frame_.getSpecificFieldElement(jTextFieldDetailTableID.getText(), detailKeyList.get(detailKeyList.size() - 1));
				if (workElement1.getAttribute("Type").equals("INTEGER") || workElement1.getAttribute("Type").equals("SMALLINT")) {
					detailRowNoID = detailKeyList.get(detailKeyList.size() - 1);			
				}
			}
		}
		//
		return noErrors;
	}
	//
	public String getFunctionTypeName(String typeID) {
		String name = "";
		ComboBoxItem item;
		for (int i = 1; i < jComboBoxType.getItemCount(); i++) {
			item = (ComboBoxItem)jComboBoxType.getItemAt(i);
			if (typeID.equals(item.getID())) {
				name = item.getName();
				break;
			}
		}
		return name;
	}
	//
	void jButtonCancel_actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}
	//
	void jTextFieldTableID_keyReleased(KeyEvent e) {
		jButtonOK.setEnabled(false);
		jButtonTableKeysEdit.setEnabled(false);
		tableNode = null;
		jLabelTableName.setText("");
		jTextFieldTableKeys.setText("*Keys");
		if (!jTextFieldTableID.getText().equals("")) {
			jLabelTableName.setText("N/A");
			tableNode = frame_.getSpecificXETreeNode("Table", jTextFieldTableID.getText());
			if (tableNode == null) {
				tableNode = frame_.getSpecificXETreeNode("Table", jTextFieldTableID.getText().toUpperCase());
				if (tableNode != null) {
					jButtonOK.setEnabled(true);
					jButtonTableKeysEdit.setEnabled(true);
					jLabelTableName.setText(tableNode.getElement().getAttribute("Name"));
					jTextFieldTableID.setText(jTextFieldTableID.getText().toUpperCase());
					this.getRootPane().setDefaultButton(jButtonOK);
				}
			} else {
				jButtonOK.setEnabled(true);
				jButtonTableKeysEdit.setEnabled(true);
				jLabelTableName.setText(tableNode.getElement().getAttribute("Name"));
				this.getRootPane().setDefaultButton(jButtonOK);
			}
		}
	}
	//
	void jTextFieldHeaderTableID_keyReleased(KeyEvent e) {
		headerTableNode = null;
		jLabelHeaderTableName.setText("");
		if (!jTextFieldHeaderTableID.getText().equals("")) {
			jLabelHeaderTableName.setText("N/A");
			headerTableNode = frame_.getSpecificXETreeNode("Table", jTextFieldHeaderTableID.getText());
			if (headerTableNode == null) {
				headerTableNode = frame_.getSpecificXETreeNode("Table", jTextFieldHeaderTableID.getText().toUpperCase());
				if (headerTableNode != null) {
					jLabelHeaderTableName.setText(headerTableNode.getElement().getAttribute("Name"));
					jTextFieldHeaderTableID.setText(jTextFieldHeaderTableID.getText().toUpperCase());
				}
			} else {
				jLabelHeaderTableName.setText(headerTableNode.getElement().getAttribute("Name"));
			}
		}
		if (headerTableNode != null & detailTableNode != null) {
			jButtonOK.setEnabled(true);
			this.getRootPane().setDefaultButton(jButtonOK);
		} else {
			jButtonOK.setEnabled(false);
		}
	}
	//
	void jTextFieldDetailTableID_keyReleased(KeyEvent e) {
		detailTableNode = null;
		jLabelDetailTableName.setText("");
		if (!jTextFieldDetailTableID.getText().equals("")) {
			jLabelDetailTableName.setText("N/A");
			detailTableNode = frame_.getSpecificXETreeNode("Table", jTextFieldDetailTableID.getText());
			if (detailTableNode == null) {
				detailTableNode = frame_.getSpecificXETreeNode("Table", jTextFieldDetailTableID.getText().toUpperCase());
				if (detailTableNode != null) {
					jLabelDetailTableName.setText(detailTableNode.getElement().getAttribute("Name"));
					jTextFieldDetailTableID.setText(jTextFieldDetailTableID.getText().toUpperCase());
				}
			} else {
				jLabelDetailTableName.setText(detailTableNode.getElement().getAttribute("Name"));
			}
		}
		if (headerTableNode != null & detailTableNode != null) {
			jButtonOK.setEnabled(true);
			this.getRootPane().setDefaultButton(jButtonOK);
		} else {
			jButtonOK.setEnabled(false);
		}
	}
	
	void jButtonTableKeysEdit_actionPerformed(ActionEvent e) {
		String names = "";
		String currentValue = headerTableKeys;
		String answer = JOptionPane.showInputDialog(this.getContentPane(), res.getString("ErrorMessage86"), currentValue);
		if (answer != null) {
			if (answer.equals("")) {
				jTextFieldTableKeys.setText("*Keys");
				tableKeys = "";
			} else {
				names = frame_.getFieldNames(jTextFieldTableID.getText(), answer, " , ", false);
				if (names.equals("")) {
					JOptionPane.showMessageDialog(this.getContentPane(), res.getString("ErrorMessage87"));
				} else {
					jTextFieldTableKeys.setText(names);
					tableKeys = answer;
				}
			}
		}
	}
	
	void jButtonHeaderTableKeysEdit_actionPerformed(ActionEvent e) {
		String names = "";
		String currentValue = headerTableKeys;
		String answer = JOptionPane.showInputDialog(this.getContentPane(), res.getString("ErrorMessage88"), currentValue);
		if (answer != null) {
			if (answer.equals("")) {
				jTextFieldHeaderTableKeys.setText("*Keys");
				headerTableKeys = "";
			} else {
				names = frame_.getFieldNames(jTextFieldHeaderTableID.getText(), answer, " , ", false);
				if (names.equals("")) {
					JOptionPane.showMessageDialog(this.getContentPane(), res.getString("ErrorMessage87"));
				} else {
					jTextFieldHeaderTableKeys.setText(names);
					headerTableKeys = answer;
				}
			}
		}
	}
	
	void jButtonDetailTableKeysEdit_actionPerformed(ActionEvent e) {
		String names = "";
		String currentValue = detailTableKeys;
		String answer = JOptionPane.showInputDialog(this.getContentPane(), res.getString("ErrorMessage89"), currentValue);
		if (answer != null) {
			if (answer.equals("")) {
				jTextFieldDetailTableKeys.setText("*Keys");
				detailTableKeys = "";
			} else {
				names = frame_.getFieldNames(jTextFieldDetailTableID.getText(), answer, " , ", false);
				if (names.equals("")) {
					JOptionPane.showMessageDialog(this.getContentPane(), res.getString("ErrorMessage87"));
				} else {
					jTextFieldDetailTableKeys.setText(names);
					detailTableKeys = answer;
				}
			}
		}
	}
	
	class ComboBoxItem{
		String id_;
		String name_;
		Icon icon_;
		ComboBoxItem(String id, String name, Icon icon){
			this.id_ = id;
			this.name_ = name;
			this.icon_ = icon;
		}
		public String getID(){
			return id_;
		}
		public String getName(){
			return name_;
		}
		public Icon getIcon(){
			return icon_;
		}
	}
	
	class ComboBoxItemRenderer extends JLabel implements ListCellRenderer{
		private static final long serialVersionUID = 1L;
		ComboBoxItemRenderer(){
			setOpaque(true);
		}
		public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus){
			ComboBoxItem item = (ComboBoxItem)value;
			setText(item.getName());
			setIcon(item.getIcon());
			if (isSelected){
				setForeground(Color.white);
				setBackground(selectionColor);
			}else{
				setForeground(Color.black);
				setBackground(Color.white);
			}
			return this;
		}
	}
}

class DialogAddFunction_jTextFieldTableID_keyAdapter extends java.awt.event.KeyAdapter {
	DialogAddFunction adaptee;
	DialogAddFunction_jTextFieldTableID_keyAdapter(DialogAddFunction adaptee) {
		this.adaptee = adaptee;
	}
	public void keyReleased(KeyEvent e) {
		adaptee.jTextFieldTableID_keyReleased(e);
	}
}

class DialogAddFunction_jTextFieldHeaderTableID_keyAdapter extends java.awt.event.KeyAdapter {
	DialogAddFunction adaptee;
	DialogAddFunction_jTextFieldHeaderTableID_keyAdapter(DialogAddFunction adaptee) {
		this.adaptee = adaptee;
	}
	public void keyReleased(KeyEvent e) {
		adaptee.jTextFieldHeaderTableID_keyReleased(e);
	}
}

class DialogAddFunction_jTextFieldDetailTableID_keyAdapter extends java.awt.event.KeyAdapter {
	DialogAddFunction adaptee;
	DialogAddFunction_jTextFieldDetailTableID_keyAdapter(DialogAddFunction adaptee) {
		this.adaptee = adaptee;
	}
	public void keyReleased(KeyEvent e) {
		adaptee.jTextFieldDetailTableID_keyReleased(e);
	}
}

class DialogAddFunction_jButtonNext_actionAdapter implements java.awt.event.ActionListener {
	DialogAddFunction adaptee;
	DialogAddFunction_jButtonNext_actionAdapter(DialogAddFunction adaptee) {
		this.adaptee = adaptee;
	}
	public void actionPerformed(ActionEvent e) {
		adaptee.jButtonNext_actionPerformed(e);
	}
}

class DialogAddFunction_jButtonOK_actionAdapter implements java.awt.event.ActionListener {
	DialogAddFunction adaptee;
	DialogAddFunction_jButtonOK_actionAdapter(DialogAddFunction adaptee) {
		this.adaptee = adaptee;
	}
	public void actionPerformed(ActionEvent e) {
		adaptee.jButtonOK_actionPerformed(e);
	}
}

class DialogAddFunction_jButtonCancel_actionAdapter implements java.awt.event.ActionListener {
	DialogAddFunction adaptee;
	DialogAddFunction_jButtonCancel_actionAdapter(DialogAddFunction adaptee) {
		this.adaptee = adaptee;
	}
	public void actionPerformed(ActionEvent e) {
		adaptee.jButtonCancel_actionPerformed(e);
	}
}

class DialogAddFunction_jButtonTableKeysEdit_actionAdapter implements java.awt.event.ActionListener {
	DialogAddFunction adaptee;
	DialogAddFunction_jButtonTableKeysEdit_actionAdapter(DialogAddFunction adaptee) {
		this.adaptee = adaptee;
	}
	public void actionPerformed(ActionEvent e) {
		adaptee.jButtonTableKeysEdit_actionPerformed(e);
	}
}

class DialogAddFunction_jButtonHeaderTableKeysEdit_actionAdapter implements java.awt.event.ActionListener {
	DialogAddFunction adaptee;
	DialogAddFunction_jButtonHeaderTableKeysEdit_actionAdapter(DialogAddFunction adaptee) {
		this.adaptee = adaptee;
	}
	public void actionPerformed(ActionEvent e) {
		adaptee.jButtonHeaderTableKeysEdit_actionPerformed(e);
	}
}

class DialogAddFunction_jButtonDetailTableKeysEdit_actionAdapter implements java.awt.event.ActionListener {
	DialogAddFunction adaptee;
	DialogAddFunction_jButtonDetailTableKeysEdit_actionAdapter(DialogAddFunction adaptee) {
		this.adaptee = adaptee;
	}
	public void actionPerformed(ActionEvent e) {
		adaptee.jButtonDetailTableKeysEdit_actionPerformed(e);
	}
}
