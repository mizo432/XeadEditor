package xeadEditor;

/*
 * Copyright (c) 2012 WATANABE kozo <qyf05466@nifty.com>,
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
import java.awt.event.*;
import java.net.URI;
import javax.swing.*;
import javax.swing.text.html.HTMLEditorKit;

public class DialogAbout extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;
	/**
	 * Application Information
	 */
	public static final String APPLICATION_NAME  = "XEAD Editor 1.1";
	public static final String FULL_VERSION  = "V1.R1.M22";
	//
	//22
	//�EXF100,110,200,300,310�Ńe�[�u���h�c��u�������ꍇ�̃t�B�[���h��`��FieldOptions�Ɋ܂܂��e�[�u���h�c��u������X�e�b�v�̃o�O���C��
	//�E�}�E�X���쒆�ɈӐ}���Ȃ�Drag&Drop���삪�F������Ĉُ�I�����邱�Ƃ̂�������C��
	//�E�e�[�u����`��Copy&Paste����ɂ����āA�����e�[�u����X�N���v�g���R�s�[�����悤�ɂ���
	//�E�e�[�u���X�N���v�g���_�C�A���O�ŕҏW��������Ɂu�ύX����v��\������悤�ɂ���
	//�E�e�[�u���X�N���v�g�Ɂu�ꎞ�ۗ��v�̐ݒ��ǉ�����
	//�E�e��X�N���v�g���Ctrl+/�������΁A�I������Ă���s���R�����g�������悤�ɂ���
	//�E�����e�[�u����`�̍폜�ɂ����āA�X�N���v�g�̎��s�^�C�~���O�ɑg�ݍ��܂�Ă��Ȃ����`�F�b�N����悤�ɂ���
	//�E�ǂ̌����t�B�[���h�����̒�`�v�f�ɗ��p����Ă��Ȃ���΁A�����e�[�u����`��������悤�ɂ���
	//�E���j���[�Ɂu�v�����[�h�w��@�\�v�̑�����ǉ�����
	//�E���j���[�́u�v�����[�h�w��@�\�v�Ɓu�v�����[�h�w��N���X�`�F�b�J�[�v�ɂ��āA�@�\�֘A�������̑ΏۂɊ܂߂�
	//�EPostgreSQL�̃f�[�^�^bigserial�ɑΉ�����
	//�EPostgreSQL�� NULL����̒ǉ��Ə����ɑΉ�����
	//�E�@�\ID�w���Menu�I�v�V������ǉ����邽�߂̃R���e�L�X�g���j���[��ǉ�����
	//�E�f�[�^�ێ烆�[�e�B���e�B�ŁA�C���|�[�g�f�[�^�̌`����CSV����u�^�u��؁v�̃e�L�X�g�t�@�C��(.txt)�v�ɕύX����
	//�E�f�[�^�ێ烆�[�e�B���e�B�ŁA�C���|�[�g�f�[�^�̂P�s�ڂ��t�B�[���hID�ł��t�B�[���h���ł������ł���悤�ɂ���
	//�E���l�t�B�[���h�����������Ƃ��Ēǉ����ꂽ�ꍇ�A�u�[���Ȃ�Ζ����v�̃`�F�b�N�������l�ɂ���悤�ɂ���
	//�E21�́u�C���|�[�g��X�L���������̌��...�v�����ɖ߂����i�ĕ`�悵�Ȃ��Ə������e�����f����Ă��܂����߁j
	//
	//21
	//�E�C���|�[�g��X�L���������̌�Ɂu�ۑ����Ȃ��v��I�񂾂Ƃ��́A�c���[�r���[���ĕ`�悵�Ȃ��悤�ɂ���
	//�E�p�l���T�C�Y�̎w��l�̏����1200����2000�Ɋg������
	//�EXF100,110,200,300,310�Ńe�[�u���h�c��u�������ꍇ�A�t�B�[���h��`��FieldOptions�Ɋ܂܂��e�[�u���h�c���u������悤�ɂ���
	//�E�e�[�u���̎g�r�v�f�ꗗ����e�[�u����`�ɃW�����v�����ۂɁA�g�r�v�f�̒�`���׍s���I�������悤�ɂ���
	//�EXF390�Ŗ��׃t�B�[���h��ǉ������ۂɁA���l�t�B�[���h�ł���΃A���C�������gRIGHT�Ƃ��Đݒ肷��悤�ɂ���
	//�E�e�[�u�����ɃN���X�`�F�b�N�̏��O���w��ł���悤�ɂ���
	//
	//20
	//�EPostgreSQL�̊֐��C���f�b�N�X�����W���[���`�F�b�N�̑ΏۊO�Ƃ���
	//
	//19
	//�E�e�[�u�����W���[�������݂���ꍇ�ł�PK�̕ύX�{�^����L���ɂ��āAPK���ύX�s�ł��郁�b�Z�[�W��\������悤�ɂ���
	//�E���W���[���`�F�b�N�ł̂o�j�Ⴂ�̃��b�Z�[�W���s���S�����������C��
	//�EXF390�̍s�ԕ����[���ɂł��Ȃ����������C������
	//�E�N���X�`�F�b�J�[�̃��O�C�������[�h�ݒ�����j���[��`�ɑg�ݍ���
	//�EUndo�̉񐔂𖳐����ɂ���
	//�E�ێ痚����݂��AUNDO�����g���ė���ǉ����̏����l��ݒ肷��悤�ɂ���
	//�E�e�[�u����`��UNDO/REDO���ɃG���[�󋵂��Đݒ肷��悤�ɂ���
	//�EPostgreSQL�Ŋ����t�B�[���h�ŃC���f�b�N�X�����ƃ��W���[���`�F�b�N�����������삵�Ȃ������C��
	//�EPostgreSQL�Ńt�B�[���h�h�c�ɑS�p�p�������������ꍇ�Ƀ��W���[���`�F�b�N�����������삵�Ȃ������C��
	//�EPostgreSQL�̃f�[�^�^character varying��VARCHAR�ɑΉ�������
	//�EXF100,110,300�̌��������̃v�����v�g�I�v�V�����Ƃ��āu��⃊�X�g�v��݂���
	//�E�@�\��`�ւ̃t�B�[���h�g�ݍ��݂̍ۂ̌x�����b�Z�[�W�Ƀf�[�^�\�[�X����g�ݍ���
	//�E�@�\�̎g�r�ꗗ�ɂ����āA���������̃v�����v�^�����̎g�r�������Ă��������C��
	//�EXF000�Ŏ��������l�̎w����e�L�X�g�t�B�[���h�łł���悤�ɂ���
	//
	//18
	//�Exead�t�@�C����XF300�^�C�v�̋@�\��`�̃C���|�[�g�ɂ����āA���o���^���׃e�[�u���̕��̓��W�b�N�����P����
	//�Exead�t�@�C���̃e�[�u����`�̃C���|�[�g�ɂ����āA�P�e�[�u�����ł̃t�B�[���hID�̏d����������Ă����o�O���C������
	//�E�v�����v�^�̌����t�B�[���h�ݒ�_�C�A���O�ŁA�R�s�[�{�^���Ń_�C�A���O�����悤�ɂ���
	//�E�i���ݏ�����VALUE:�̎w����ȗ������ꍇ�A�i���ݏ����̈ꗗ��ŏ����l�Ƃ��Ď�����Ȃ��o�O���C������
	//�E�c���[�r���[��̋@�\��`�̏�Ƀ}�E�X�|�C���^��u���΋@�\�^�C�v���q���g�\�������悤�ɂ���
	//�EXF310�̍s�ǉ����X�g�̌����t�B�[���h�ݒ�_�C�A���O�̕����L����
	//
	//17
	//�E���z�t�B�[���h�̏ꍇ�A�t�B�[���h�ꗗ��Ńt�B�[���hID�݂̂��J�b�R�t������悤�ɂ���
	//�EXF100,110,300�ɂ��āA�����\���I�v�V������g�ݍ���
	//�EXF310�̍s�ǉ����X�g�̎w��łO�̌��������������悤�ɂ���
	//�Exead�t�@�C���̃C���|�[�g�ɂ����āA�e�[�u���̓񎟎��ʎq��`����荞�ނ悤�ɂ���
	//�Exead�t�@�C���̃C���|�[�g�ɂ����āA�e�[�u���̌p����������荞�܂Ȃ��悤�ɂ����i�����t�B�[���h�Ƃ��Ď��ƂŒ�`����邽�߁j
	//�E�v�����v�^�֐��̃p�����[�^�ݒ�_�C�A���O�̕����L����
	//�E���C�A�E�g�m�F�_�C�A���O�ɂ����ē��t�t�B�[���h�̘g���\���ݒ�����P����
	//�EPostgreSQL��bytea�^��BLOB�^�ɑΉ�������悤�ɂ���
	//�E�f�[�^�ێ烆�[�e�B���e�B��BLOB�^��ǂݏ������Ȃ��悤�ɂ���
	//�E�f�[�^�ێ烆�[�e�B���e�B�ŃV���O���N�H�[�e�[�V�������܂ރf�[�^��������悤�ɂ���
	//�E�f�[�^�ێ烆�[�e�B���e�B�łۗ̕����̃R�~�b�g����̃`�F�b�N���W�b�N�����P����
	//�E�����e�[�u���̒ǉ��ݒ�_�C�A���O�̃��C�A�E�g�����P����
	//�E�����e�[�u���̒ǉ���Ɂu������KEY���ځv��ύX�ł���悤�ɂ���
	//�E�e�[�u���X�N���v�g�̎��s�^�C�~���O�̑I���ŁA�����e�[�u�������������ɏ]���Ĉꗗ�����悤�ɂ���
	//�E�c���[�r���[��� Ctrl+C �� Ctrl+V ���g����悤�ɂ���ƂƂ��ɁA�����m�[�h�𓯎��I���ł��Ȃ��悤�ɂ���
	//�E�V�X�e���̋N�������SQL�R���\�[���̎��s�̂��߂̋@�\�L�[��F9����F5�ɕύX����
	//�EXF310�̍s�ǉ����X�g�̕��я��w��ł̃o�O���C������
	//�EXF110�̃o�b�`�t�B�[���h�ɂ��ă��C�A�E�g�\���ł��Ȃ����Ƃ���������C������
	//�E�X�N���v�g�̂P�s���ɕ�����'{'��'}'���܂܂�Ă���Ɛ������C���f���g��������Ȃ������C������
	//�E�E�y�C���Œl��ύX�����Ctrl+S�������Ă��㏑������Ȃ����������C��
	//�E�����t�B�[���h�̎g�r���ɂ��āAXF110�ł̗��p�󋵂��s���m�Ɏ�����Ă��������C������
	public static final String FORMAT_VERSION  = "1.1";
	public static final String PRODUCT_NAME = "XEAD[zi:d] Editor";
	public static final String COPYRIGHT = "Copyright 2013 DBC,Ltd.";
	public static final String URL_DBC = "http://homepage2.nifty.com/dbc/";
	/**
	 * Components on dialog
	 */
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel insetsPanel1 = new JPanel();
	private JPanel insetsPanel2 = new JPanel();
	private JPanel insetsPanel3 = new JPanel();
	private JButton buttonOK = new JButton();
	private JLabel imageLabel = new JLabel();
	private JLabel labelName = new JLabel();
	private JLabel labelVersion = new JLabel();
	private JLabel labelCopyright = new JLabel();
	private JLabel labelURL = new JLabel();
	private ImageIcon imageXead = new ImageIcon();
	private HTMLEditorKit htmlEditorKit = new HTMLEditorKit();
	private Desktop desktop = Desktop.getDesktop();
	private Editor editor;

	public DialogAbout(Editor parent) {
		super(parent);
		enableEvents(AWTEvent.WINDOW_EVENT_MASK);
		try {
			editor = parent;
			jbInit(parent);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	private void jbInit(Editor parent) throws Exception  {
		imageXead = new ImageIcon(xeadEditor.Editor.class.getResource("title.png"));
		imageLabel.setIcon(imageXead);
		panel1.setLayout(new BorderLayout());
		panel1.setBorder(BorderFactory.createEtchedBorder());
		panel2.setLayout(new BorderLayout());
		insetsPanel2.setLayout(new BorderLayout());
		insetsPanel2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		insetsPanel2.setPreferredSize(new Dimension(75, 52));
		insetsPanel2.add(imageLabel, BorderLayout.EAST);
		//
		labelName.setFont(new java.awt.Font("Serif", 1, 16));
		labelName.setHorizontalAlignment(SwingConstants.CENTER);
		labelName.setText(PRODUCT_NAME);
		labelName.setBounds(new Rectangle(-5, 9, 190, 18));
		labelVersion.setFont(new java.awt.Font("Dialog", 0, 12));
		labelVersion.setHorizontalAlignment(SwingConstants.CENTER);
		labelVersion.setText(FULL_VERSION);
		labelVersion.setBounds(new Rectangle(-5, 32, 190, 15));
		labelCopyright.setFont(new java.awt.Font("Dialog", 0, 12));
		labelCopyright.setHorizontalAlignment(SwingConstants.CENTER);
		labelCopyright.setText(COPYRIGHT);
		labelCopyright.setBounds(new Rectangle(-5, 53, 190, 15));
		labelURL.setFont(new java.awt.Font("Dialog", 0, 12));
		labelURL.setHorizontalAlignment(SwingConstants.CENTER);
		labelURL.setText("<html><u><font color='blue'>" + URL_DBC);
		labelURL.setBounds(new Rectangle(-5, 73, 190, 15));
		labelURL.addMouseListener(new DialogAbout_labelURL_mouseAdapter(this));
		insetsPanel3.setLayout(null);
		insetsPanel3.setBorder(BorderFactory.createEmptyBorder(10, 60, 10, 10));
		insetsPanel3.setPreferredSize(new Dimension(190, 80));
		insetsPanel3.add(labelName, null);
		insetsPanel3.add(labelVersion, null);
		insetsPanel3.add(labelCopyright, null);
		insetsPanel3.add(labelURL, null);
		//
		buttonOK.setText("OK");
		buttonOK.addActionListener(this);
		insetsPanel1.add(buttonOK, null);
		//
		panel1.add(insetsPanel1, BorderLayout.SOUTH);
		panel1.add(panel2, BorderLayout.NORTH);
		panel2.setPreferredSize(new Dimension(270, 90));
		panel2.add(insetsPanel2, BorderLayout.CENTER);
		panel2.add(insetsPanel3, BorderLayout.EAST);
		//
		this.setTitle("About XEAD Editor");
		this.getContentPane().add(panel1, null);
		this.setResizable(false);
	}

	public void request() {
		insetsPanel1.getRootPane().setDefaultButton(buttonOK);
		Dimension dlgSize = this.getPreferredSize();
		Dimension frmSize = editor.getSize();
		Point loc = editor.getLocation();
		this.setLocation((frmSize.width - dlgSize.width) / 2 + loc.x, (frmSize.height - dlgSize.height) / 2 + loc.y);
		this.pack();
		super.setVisible(true);
	}

	protected void processWindowEvent(WindowEvent e) {
		if (e.getID() == WindowEvent.WINDOW_CLOSING) {
			cancel();
		}
		super.processWindowEvent(e);
	}

	void cancel() {
		dispose();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttonOK) {
			cancel();
		}
	}

	void labelURL_mouseClicked(MouseEvent e) {
		try {
			setCursor(new Cursor(Cursor.WAIT_CURSOR));
			desktop.browse(new URI(URL_DBC));
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "The Site is inaccessible.");
		} finally {
			setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
	}

	void labelURL_mouseEntered(MouseEvent e) {
		setCursor(htmlEditorKit.getLinkCursor());
	}

	void labelURL_mouseExited(MouseEvent e) {
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}
}

class DialogAbout_labelURL_mouseAdapter extends java.awt.event.MouseAdapter {
	DialogAbout adaptee;
	DialogAbout_labelURL_mouseAdapter(DialogAbout adaptee) {
		this.adaptee = adaptee;
	}
	public void mouseClicked(MouseEvent e) {
		adaptee.labelURL_mouseClicked(e);
	}
	public void mouseEntered(MouseEvent e) {
		adaptee.labelURL_mouseEntered(e);
	}
	public void mouseExited(MouseEvent e) {
		adaptee.labelURL_mouseExited(e);
	}
}
