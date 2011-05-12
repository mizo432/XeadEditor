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

public class Res_ja extends java.util.ListResourceBundle {
	private static final Object[][] contents = new String[][]{
		{ "About", "バージョン情報" },
		{ "AcceptMinus", "マイナス可" },
		{ "Action", "アクション" },
		{ "ActionAddBlankRow", "空白行の追加" },
		{ "ActionAddRows", "明細行の追加" },
		{ "ActionAddRowWithSelected", "選択行で追加" },
		{ "ActionAfterInsert", "追加処理後" },
		{ "ActionBackToSelectList", "更新リストから選択リストへ戻る" },
		{ "ActionCall", "の起動" },
		{ "ActionCallDTLFunctionToAdd", "明細処理機能を追加モードで起動" },
		{ "ActionCallFunction", "指定機能の起動" },
		{ "ActionCallHDRFunction", "見出し処理機能を起動" },
		{ "ActionDelete", "削除" },
		{ "ActionExit", "終了" },
		{ "ActionGoToCopyMode", "複写モード移行" },
		{ "ActionGoToEditMode", "編集モード移行及び更新" },
		{ "ActionGoToUpdateList", "選択リストから更新リストに進む" },
		{ "ActionOutputEXCEL", "エクセルに一覧出力" },
		{ "ActionRemoveRow", "明細行の除去" },
		{ "ActionReturnNull", "Nullキーを返す" },
		{ "ActionUpdate", "編集結果で更新" },
		{ "ActiveWhere", "有効行Where" },
		{ "Add", "追加" },
		{ "AddChild", "下位要素を追加" },
		{ "AddFields", "追加フィールドの選択" },
		{ "AddFunction", "機能定義の追加" },
		{ "AddIndex", "インデックスの追加" },
		{ "AddIndexMessage", "物理フィールドＩＤを';'でつなげて指定してください。\nフィールドＩＤの後に'(D)'を置けば降順とみなされます。" },
		{ "AddJoinTable", "結合テーブルの追加" },
		{ "AddJoinTableMessage1", "テーブルＩＤを指定して「次へ」を押してください。必要ならばエイリアスも指定してください。" },
		{ "AddJoinTableMessage2", "「結合先KEY項目」には " },
		{ "AddJoinTableMessage3", "上の項目のIDを指定してください。「結合元KEY項目」には「結合先KEY項目」に対応する " },
		{ "AddJoinTableMessage4", "上の項目または結合済項目のIDを、TABLEID.FIELDID のようにテーブルID付きで指定してください。項目が複数の場合は ; で区切ります。" },
		{ "AddKeyMessage", "物理フィールドＩＤを';'でつなげて指定してください。" },
		{ "AddMode", "追加モード" },
		{ "AddNewFields", "フィールド定義の新規追加" },
		{ "AddNewMenus", "メニュー定義の新規追加" },
		{ "AddNewSubsystems", "サブシステム定義の新規追加" },
		{ "AddNewTables", "テーブル定義の新規追加" },
		{ "AddPKey", "一次識別子の追加" },
		{ "AddRow", "行追加" },
		{ "AddRowDetailRowNo", "行追加時の自動設定行番" },
		{ "AddRowList", "行追加設定" },
		{ "AddRowListColumn", "追加行参照リストの明細フィールド" },
		{ "AddRowListFieldsDialogComment", "＊参照リストから追加行への返しフィールドを、いずれもエイリアス付きで指定してください。複数指定する場合はセミコロン(;)で区切ってください。何も指定しない場合、参照リストと明細行とで共通しているフィールドが返しフィールドとみなされます。" },
		{ "AddRowListFieldsDialogTitle", "追加行への返しフィールド設定" },
		{ "AddRowListOrderBy", "追加行参照リスト一覧順" },
		{ "AddRowListReturnFromField", "追加行参照リストからの戻し元フィールド" },
		{ "AddRowListReturnFromFieldShort", "戻し元フィールド" },
		{ "AddRowListReturnToField", "追加行参照リストからの戻し先フィールド" },
		{ "AddRowListReturnToFieldShort", "戻し先フィールド" },
		{ "AddRowListTable", "行追加参照テーブル" },
		{ "AddRowListTableDialogComment", "＊「キー値フィールド」には、検索キーの並びに合わせて見出し域上のフィールドをエイリアス付きで指定してください。" },
		{ "AddRowListTableDialogTitle", "行追加用参照テーブルの設定" },
		{ "AddRowListWithField", "追加行リスト検索キー" },
		{ "AddRowListWithFieldShort", "リスト検索キー" },
		{ "AddRowListWithHDRField", "追加行参照リストの選択キーフィールド" },
		{ "AddRowListWithHDRFieldShort", "キー値フィールド" },
		{ "AddSKey", "二次識別子の追加" },
		{ "AddTabDialogComment", "新たな明細テーブル向けのタブが追加されます。見出しテーブルから見て「子」または「参照元」を明細テーブルとして指定してください。" },
		{ "AddTabDialogKeyComment", "「見出しKEY項目」の並びにしたがって「処理KEY項目」に明細テーブル側の処理KEYを、フィールドを';'で区切って指定してください。" },
		{ "AddTabDialogTitle", "明細タブの追加" },
		{ "Alias", "エイリアス" },
		{ "Alignment", "アラインメント" },
		{ "AlignmentMargin", "アラインマージン" },
		{ "AllSubsystems", "（すべてのサブシステム）" },
		{ "AndSoOn1", "、他" },
		{ "AndSoOn2", "件" },
		{ "AskIfReplacing", "指定されたファイルは既に存在します。上書きしますか？" },
		{ "AttributeName", "属性名" },
		{ "AttributeValue", "属性値" },
		{ "AutoConnect", "Editor起動時にＤＢに自動接続する" },
		{ "AutoNumberID", "自動採番ＩＤ" },
		{ "AutoRowNumber", "Auto行番" },
		{ "BackToEdit", "編集に戻る" },
		{ "BarcodeType", "バーコードタイプ" },
		{ "BatchField", "バッチフィールド" },
		{ "BatchKey", "バッチ条件" },
		{ "BatchKeyAbout", "＊「バッチ条件」とは、一次テーブル上の複数の更新レコードをバッチテーブルの新規レコードに関連付けるためのフィールド一致条件のことです。それぞれのテーブルのバッチ条件フィールドをセミコロンで区切って並べてください。一次テーブル側の条件についてはエイリアス指定が必要です。" },
		{ "BatchKeyField", "バッチテーブル側のバッチ条件" },
		{ "BatchRecordCallID", "バッチ機能ＩＤ" },
		{ "BatchRecordCallMsg", "実行確認Check" },
		{ "BatchTable", "バッチテーブル" },
		{ "BatchTableDialogTitle", "バッチテーブルとバッチ条件の設定" },
		{ "BatchWithKeyField", "一次テーブル側のバッチ条件" },
		{ "Bookmark", "しおりの設定・解除" },
		{ "Both", "両方" },
		{ "BrowseHelp", "概要と目次" },
		{ "ButtonPositionComment", "０（左端）〜６（右端）" },
		{ "ButtonPositionComment0_5", "０（左端）〜５（右端）" },
		{ "CallFunction", "機能を起動" },
		{ "CallPromptFunction", "指定機能" },
		{ "Cancel", "取消" },
		{ "CancelChanges", "保存しない" },
		{ "Caption", "キャプション" },
		{ "CaptionErrorMessage", "キャプション値として '('  ')'  ',' は使えません。" },
		{ "CaseSensitive", "大文字小文字を区別する" },
		{ "Changed", "変更あり" },
		{ "ChangeLabel", "ID⇔名称" },
		{ "CheckContinueAdding", "継続追加"},
		{ "CheckFunctionsCalled", "機能関連性検査"},
		{ "CheckFunctionsCalledMessage1", "機能関連上の問題は見つかりませんでした。"},
		{ "CheckFunctionsCalledMessage2", "いずれの定義要素からも起動されません。"},
		{ "CheckFunctionsCalledMessage3", "スクリプト中で記述されているID '"},
		{ "CheckFunctionsCalledMessage4", "' が機能として存在しません。"},
		{ "CheckFunctionsCalledMessage5", "起動される機能 '"},
		{ "CheckFunctionsCalledMessage6", "' が存在しません。"},
		{ "CheckFunctionsCalledMessage7", "スクリプト「"},
		{ "CheckFunctionsCalledMessage8", "」中で記述されているID '"},
		{ "CheckFunctionsCalledMessage9", "' が機能として存在しません。"},
		{ "CheckFunctionsCalledMessage10", "追加ボタンでの呼び出しが設定されていますが、明細処理機能が設定されていません。"},
		{ "CheckFunctionsCalledMessage11", "見出しレコード処理用ボタンが設定されていますが、見出し処理機能が設定されていません。"},
		{ "CheckUpdateOnly", "更新専用"},
		{ "ChooseAction", "閲覧・編集されるファイルを指定してください。定義を新規作成したい場合\nは、Skeleton.xeaf をフォルダ毎コピーしてリネームしたものを用いてください。" },
		{ "ClearValues", "値クリア" },
		{ "Close", "閉じる" },
		{ "CloseNotSaving", "保存せずに閉じる" },
		{ "CloseSaving", "保存して閉じる" },
		{ "ColumnOnList", "表示リスト" },
		{ "Columns", "明細フィールド" },
		{ "Comma", "、" },
		{ "Comment", "コメント" },
		{ "Commit", "コミット" },
		{ "Compress", "COMPRESS" },
		{ "ControlOptions", "制御オプション" },
		{ "CopiedNameExt", "(コピー)" },
		{ "Copy", "コピー" },
		{ "CreateDefinition", "定義作成" },
		{ "CreateInSubsystem", "作成先サブシステム" },
		{ "CreateTableComment", "＊CREATE文を用いてテーブル定義を１個ずつ作成できます（COMMENTキーワードで「フィールド名」を指定できます）。テーブル定義のみが作成されるので、定義を編集し完成させたうえで、個別にテーブルモジュールを作成してください。ここではFOREIGN KEY制約句は無視され、有効なデータ型は以下のとおりです。CHAR,VARCHAR,INTEGER,SMALLINT,BIGINT,DOUBLE,DECIMAL,NUMERIC,REAL,DATE,TIME,TIMESTAMP" },
		{ "CreateTableDef", "テーブル定義作成" },
		{ "CreateTableStatement", "CREATE TABLE文" },
		{ "CreateTableTitle", "CREATE文を用いたテーブル定義作成" },
		{ "Data", "データ" },
		{ "Database", "データベース" },
		{ "DataMessages", "必要に応じてWhere条件とOrderByを指定したうえで、検索ボタンを押してください。" },
		{ "DataOutput", "EXCEL出力" },
		{ "DataSource", "データソース" },
		{ "DataUtilityMessage1", "必要に応じて値を入力して「コミット」を押してください。" },
		{ "DataUtilityMessage2", "データが正常に更新されました。" },
		{ "DataUtilityMessage3", "＊このデータを読み取って更新するまでの間に、他の操作またはユーザによって\n更新されました。要求はキャンセルされました。" },
		{ "DataUtilityMessage4", "指定のキー値を持つデータが既に存在しています。追加できません。" },
		{ "DataUtilityMessage5", "データが正常に追加されました。" },
		{ "DataUtilityMessage6", "データが正常に削除されました。" },
		{ "DataUtilityMessage7", "テーブルが圧縮されました。" },
		{ "DateFormat", "日付形式" },
		{ "DBConnectMessage1", "データベースサービスが開始されていないため、モジュールチェック、システム起動、ＳＱＬコンソール\n等の機能は利用できません。サービスの開始方法については、ドキュメントで確認してください。" },
		{ "DBConnectMessage2", "データベース " },
		{ "DBConnectMessage3", " に接続できませんでした。\n" },
		{ "DBConnectMessage4", "データベースに接続中なので、これらの情報は変更できません。" },
		{ "Decimal", "小数桁" },
		{ "Delete", "削除" },
		{ "Delete", "削除" },
		{ "DeleteCanceled", "削除要求が取り消されました。" },
		{ "DeleteCheckMessage", "この行を削除します。よろしいですか？" },
		{ "DeleteCheckTitle", "削除確認" },
		{ "DeleteOperation", "削除操作" },
		{ "DeleteTableDefinitionAndModule", "モジュールと定義を削除" },
		{ "DeleteTableDefinitionOnly", "定義のみを削除" },
		{ "DeleteTableMessage", "テーブルモジュールが存在します。定義とともにモジュールを削除しますか？" },
		{ "DeleteTableModule", "モジュールの削除確認" },
		{ "Descent", "(降順)" },
		{ "DetailRowNumber", "最後のフィールドをAuto行番として処理する" },
		{ "DisconnectCmd", "切断コマンド" },
		{ "DTLField", "明細フィールド" },
		{ "DTLFields", "明細フィールド" },
		{ "DTLFont", "明細フォント" },
		{ "DTLFunction", "明細処理機能" },
		{ "DTLFunctionID", "明細処理機能ID" },
		{ "DTLTable", "明細テーブル" },
		{ "DTLTableID", "明細テーブルID" },
		{ "DTLTableKeys", "明細ＫＥＹ" },
		{ "DTLTabs", "明細タブ" },
		{ "Edit", "編集" },
		{ "EditCode", "編集コード" },
		{ "EditDetailTableKeyTitle", "明細テーブルキーの編集" },
		{ "EditDetailTableKeyComment", "見出しテーブルと明細テーブルのユニークキーとを指定してください。キーの上位共通部分のデータタイプは同一でなければなりません。" },
		{ "EditKeyFieldsMessage", "一次テーブルの処理キーを変更できます。テーブル上\nの物理フィールドＩＤを';'でつなげて指定してください。" },
		{ "EditMode", "編集モード" },
		{ "EditOrderByMessage1", "テーブル上のフィールドＩＤを';'でつなげて指定してください。\nフィールドＩＤの後に'(D)'を置けば降順とみなされます。" },
		{ "EditOrderByMessage2", "テーブルＩＤとフィールドＩＤを'.'でつなげて指定してください。フィールドＩＤの後に'(D)'を置けば\n降順とみなされます。複数項目を指定する場合は';'で区切って並べてください。" },
		{ "EditRangeKeyMessage", "テーブル上のデータタイプが同一のフィールドＩＤを';'でつなげて指定してください。" },
		{ "EditTableScriptTitle", "テーブル・スクリプトの編集" },
		{ "ElementName", "定義要素名" },
		{ "ElementType", "定義要素区分" },
		{ "ErrorLog1", "エラーログ " },
		{ "ErrorLog2", " が発行されました。" },
		{ "ErrorMessage1", "[" },
		{ "ErrorMessage2", "]のエラーが発生しました。\n詳細については、終了時に出力されるエラーログファイル(xeadedt_err_....txt)を参照してください。" },
		{ "ErrorMessage3", "エラー：ID'" },
		{ "ErrorMessage4", "'のフィールドが存在しません。" },
		{ "ErrorMessage5", "エラー：指定されたフィールドのデータタイプが整数でありません。" },
		{ "ErrorMessage6", "エラー：１つ目の項目定義が無効です。" },
		{ "ErrorMessage7", "エラー：２つ目の項目定義が無効です。" },
		{ "ErrorMessage8", "エラー：同一項目が指定されています。" },
		{ "ErrorMessage9", "エラー：タイプと長さが同一の項目を指定してください。" },
		{ "ErrorMessage10", "エラー：１つ目の項目はテーブルの一次識別子に含まれていなければなりません。" },
		{ "ErrorMessage11", "指定値'" },
		{ "ErrorMessage12", "'の形式が正しくないか、フィールド定義が存在しません。" },
		{ "ErrorMessage13", "適正範囲内(" },
		{ "ErrorMessage14", ")でないサイズが指定されました。値は無視されます。" },
		{ "ErrorMessage15", "数値でないサイズが指定されました。値は無視されます。" },
		{ "ErrorMessage16", "ID='" },
		{ "ErrorMessage17", "'の定義要素が既に存在しています。この要素は追加されません。" },
		{ "ErrorMessage18", "ID='" },
		{ "ErrorMessage19", "'のテーブル定義が既にこのサブシステム\nまたは他のサブシステムの下に存在しています。\nこの要素は追加されません。" },
		{ "ErrorMessage20", "このサブシステムにはテーブル定義か機能定義が含まれているため、削除できません。" },
		{ "ErrorMessage21", "このテーブルを利用する機能か結合テーブルが存在します。それらをはずしたうえで削除してください。" },
		{ "ErrorMessage22", "この機能はすでにメニューオプションとして組み込まれています。" },
		{ "ErrorMessage23", "メニューにオプションを追加する余地がありません。" },
		{ "ErrorMessage24", "マージンの値が正しくありません。省略値(50;50;50;50)に設定されました。" },
		{ "ErrorMessage25", "コマンド " },
		{ "ErrorMessage26", " を実行できませんでした。\n" },
		{ "ErrorMessage27", "ヘルプファイルを開けません。" },
		{ "ErrorMessage28", "保存できませんでした。" },
		{ "ErrorMessage29", "このフォントを利用する機能が存在します。それらをはずしたうえで削除してください。" },
		{ "ErrorMessage30", "削除不可。少なくとも１件の要素が必要です。" },
		{ "ErrorMessage31", "この定義要素を利用する機能か結合テーブルが存在します。それらをはずしたうえで削除してください。" },
		{ "ErrorMessage32", "" },
		{ "ErrorMessage33", "件のフィールドが結合フィールドとして選択されているため削除できません。それらをはずしたうえで削除してください。\nなお、結合フィールドが他の定義要素によって利用されていると、フィールドリスト上で選択をはずせなくなります。\nその場合、フィールド名をクリックすれば、どの定義要素によって利用されているかが表示されます。" },
		{ "ErrorMessage34", "この機能は、メニュー（" },
		{ "ErrorMessage35", "）に組み込まれているため、削除できません。" },
		{ "ErrorMessage36", "この機能は、機能（" },
		{ "ErrorMessage37", "）で利用されているため、削除できません。" },
		{ "ErrorMessage38", "正しくない結合順序が指定されることになります。要求は無視されます。\n（各結合テーブルの処理キー項目の値が、先行する読取によって確保されている必要があります）" },
		{ "ErrorMessage39", "このテーブルを利用する機能、または結合テーブルとして利用するテーブルが存在するのでキー構成を修正できません。" },
		{ "ErrorMessage40", "エラー：バッチテーブル側の条件にエイリアス指定は不要です。" },
		{ "ErrorMessage41", "エラー：一次テーブルのバッチ条件指定が正しくありません：" },
		{ "ErrorMessage42", "エラー：バッチテーブルのバッチ条件に指定されたフィールドＩＤが正しくありません：" },
		{ "ErrorMessage43", "エラー：対応するバッチ条件フィールドで、項目タイプ／桁が異なっている部分があります：" },
		{ "ErrorMessage44", "エラー：一次テーブルのバッチ条件には、エイリアス（テーブルＩＤ）とフィールドＩＤとをピリオド(.)で区切って指定してください。" },
		{ "ErrorMessage45", "エラー：バッチ条件の項目数が一次テーブルとバッチテーブルとで一致していません。" },
		{ "ErrorMessage46", "エラー：リスト検索キーにエイリアス指定は不要です。" },
		{ "ErrorMessage47", "エラー：リスト検索キーに指定されたフィールドＩＤが正しくありません。" },
		{ "ErrorMessage48", "エラー：キー値フィールドが存在しません。" },
		{ "ErrorMessage49", "エラー：キー項目間で、項目タイプ／桁が異なっている部分があります。" },
		{ "ErrorMessage50", "エラー：キー値フィールドには、見出しテーブル上のフィールドか結合フィールドのいずれかを指定してください。" },
		{ "ErrorMessage51", "エラー：キー値フィールドはエイリアス指定でなければなりません。" },
		{ "ErrorMessage52", "エラー：リスト検索キーとキー値フィールドとの項目数が一致していません。" },
		{ "ErrorMessage53", "エラー：返し元フィールドの指定が正しくありません。" },
		{ "ErrorMessage54", "エラー：返し先フィールドの指定が正しくありません。" },
		{ "ErrorMessage55", "エラー：キー項目間で、項目タイプ／桁が異なっている部分があります。" },
		{ "ErrorMessage56", "エラー：返し先フィールドには、エイリアス（テーブルＩＤ）とフィールドＩＤとをピリオド(.)で区切って指定してください。" },
		{ "ErrorMessage57", "エラー：返し元フィールドには、エイリアス（テーブルＩＤ）とフィールドＩＤとをピリオド(.)で区切って指定してください。" },
		{ "ErrorMessage58", "エラー：返し元と返し先とで項目数が一致していません。" },
		{ "ErrorMessage59", "エラー：渡し元フィールドの指定値 " },
		{ "ErrorMessage60", " に対応するデータソース定義が存在しません。" },
		{ "ErrorMessage61", "エラー：渡し元フィールドには、エイリアス（テーブルＩＤ）とフィールドＩＤとをピリオド(.)で区切って指定してください。" },
		{ "ErrorMessage62", "エラー：渡し先フィールドの指定値 " },
		{ "ErrorMessage63", " に対応するデータソース定義が存在しません。" },
		{ "ErrorMessage64", "エラー：渡し先フィールドには、エイリアス（テーブルＩＤ）とフィールドＩＤとをピリオド(.)で区切って指定してください。" },
		{ "ErrorMessage65", "エラー：渡しフィールドの数が元と先とで一致していません。" },
		{ "ErrorMessage66", "エラー：返しフィールドの数が元と先とで一致していません。" },
		{ "ErrorMessage67", "エラー：返し元フィールドの指定値 " },
		{ "ErrorMessage68", " に対応するデータソース定義が存在しません。" },
		{ "ErrorMessage69", "エラー：返し元フィールドには、エイリアス（テーブルＩＤ）とフィールドＩＤとをピリオド(.)で区切って指定してください。" },
		{ "ErrorMessage70", "エラー：返し先フィールドの指定値 " },
		{ "ErrorMessage71", " に対応するデータソース定義が存在しません。" },
		{ "ErrorMessage72", "エラー：返し先フィールドには、エイリアス（テーブルＩＤ）とフィールドＩＤとをピリオド(.)で区切って指定してください。" },
		{ "ErrorMessage73", "エラー：明細KEY項目を指定してください。" },
		{ "ErrorMessage74", "エラー：明細KEY項目は見出しKEY項目より多く指定されなければなりません。" },
		{ "ErrorMessage75", "エラー：ID'" },
		{ "ErrorMessage76", "'のフィールド定義が存在しません。" },
		{ "ErrorMessage77", "エラー：対応する上位キー項目のタイプか長さが一致していません。" },
		{ "ErrorMessage78", "エラー：機能IDを入力してください。" },
		{ "ErrorMessage79", "エラー：機能タイプを選択してください。" },
		{ "ErrorMessage80", "エラー：機能名を入力してください。" },
		{ "ErrorMessage81", "エラー：このIDを持つ機能定義が既にこのサブシステムまたは\n他のサブシステムの下に存在しています。" },
		{ "ErrorMessage82", "指定テーブルに一次識別子が定義されていないため、機能を作成できません。" },
		{ "ErrorMessage83", "見出しテーブルに一次識別子が定義されていないため、機能を作成できません。" },
		{ "ErrorMessage84", "明細テーブルに一次識別子が定義されていないため、機能を作成できません。" },
		{ "ErrorMessage85", "エラー：見出しテーブルか明細テーブルにキーが定義されていません。" },
		{ "ErrorMessage86", "一次テーブル上の物理フィールドＩＤを';'でつなげて指定してください。" },
		{ "ErrorMessage87", "フィールドＩＤが正しくありません。" },
		{ "ErrorMessage88", "見出しテーブル上の物理フィールドＩＤを';'でつなげて指定してください。" },
		{ "ErrorMessage89", "明細テーブル上の物理フィールドＩＤを';'でつなげて指定してください。" },
		{ "ErrorMessage90", "テーブルＩＤが正しくありません。" },
		{ "ErrorMessage91", "指定のテーブルは既に結合テーブルとして組み込まれています。\nエイリアスを指定して重複を避けてください。" },
		{ "ErrorMessage92", "キー項目をいずれも指定してください。" },
		{ "ErrorMessage93", "キー項目の数が一致していません。" },
		{ "ErrorMessage94", "エラー：対応するキー項目のタイプか長さが一致していません。" },
		{ "ErrorMessage95", "１桁目に半角英文字以外は使えません。" },
		{ "ErrorMessage96", "半角英数字のみを用いてください。" },
		{ "ErrorMessage97", "エラー：テーブル定義は作成されませんでした。CREATE文に間違いがあります。" },
		{ "ErrorMessage98", "" },
		{ "ErrorMessage99", "のテーブル定義が作成されました。" },
		{ "ErrorMessage100", "" },
		{ "ErrorMessage101", "のテーブル定義は、このサブシステムまたは他のサブシステムにおいて既存です。定義は作成されませんでした。" },
		{ "ErrorMessage102", "" },
		{ "ErrorMessage103", "のタイプ " },
		{ "ErrorMessage104", " が無効です。フィールド定義として取り込まれません。" },
		{ "ErrorMessage105", "テーブルＩＤにアンダーバー'_'は使えません。" },
		{ "ErrorMessage106", "エラー：見出しKEY項目を指定してください。" },
		{ "EventAC", "追加後" },
		{ "EventAD", "削除後" },
		{ "EventAR", "読込後" },
		{ "EventAU", "更新後" },
		{ "EventBC", "追加前" },
		{ "EventBD", "削除前" },
		{ "EventBR", "読込前" },
		{ "EventBU", "更新前" },
		{ "EventReferAR", "全結合テーブルの読込後" },
		{ "EventReferAR1", "「" },
		{ "EventReferAR2", "」の読込後" },
		{ "EventReferAS", "明細データの処理後" },
		{ "EventReferBR", "全結合テーブルの読込前" },
		{ "EventReferBR1", "「" },
		{ "EventReferBR2", "」の読込前" },
		{ "ExchangeParms", "交換" },
		{ "Execute", "実行" },
		{ "ExecuteWhen", "実行タイミング" },
		{ "ExecuteWhenJoin", "実行タイミング（関連テーブル操作）" },
		{ "Exit", "終了" },
		{ "ExitMessage", "編集結果を保存して終了しますか？" },
		{ "ExitNotSaving", "保存せずに終了" },
		{ "ExitSaving", "保存して終了" },
		{ "ExtentionInvalid", "指定ファイルの拡張子が無効です。" },
		{ "F3ToScan", "検索F3" },
		{ "FailedToParse", "指定されたxeafファイルの解析に失敗しました。様式を確認してください" },
		{ "Field", "フィールド" },
		{ "FieldAccountDate", "会計日付" },
		{ "FieldDialNo", "電話番号" },
		{ "FieldExtType", "拡張データタイプ" },
		{ "FieldFiscalYear", "年度" },
		{ "FieldID", "フィールドID" },
		{ "FieldImageFile", "画像ファイル" },
		{ "FieldKana", "半角カナ" },
		{ "FieldKanji", "漢字" },
		{ "FieldKubunID", "区分ＩＤ" },
		{ "FieldMargin", "間隔" },
		{ "FieldMonthSeq", "月序" },
		{ "FieldName", "フィールド名" },
		{ "FieldRows", "行数" },
		{ "Fields", "フィールド" },
		{ "FieldSize", "桁数" },
		{ "FieldsToExchangeComment", "＊関数へ渡すフィールドと関数から返すフィールド（受け取るフィールド）を、いずれもエイリアス付きで指定してください。複数指定する場合はセミコロン(;)で区切ってください。" },
		{ "FieldsToExchangeDialog", "プロンプタ関数との交換フィールド設定" },
		{ "FieldsToGet", "返し元フィールド" },
		{ "FieldsToGetTo", "先フィールド" },
		{ "FieldsToPut", "渡し元フィールド" },
		{ "FieldsToPutTo", "先フィールド" },
		{ "FieldType", "データタイプ" },
		{ "FieldURL", "ＵＲＬ" },
		{ "FieldUsageInScript1", "スクリプト「" },
		{ "FieldUsageInScript2", "」中の変数" },
		{ "FieldUsageInScript3", "スクリプト中の変数" },
		{ "FieldUsageMessage", "このフィールドは以下の定義要素で利用されています。\n" },
		{ "FieldUsageToKeyField", "結合テーブルの参照KEY" },
		{ "FieldUsageWithKeyField1", "結合テーブル" },
		{ "FieldUsageWithKeyField2", "への処理KEY" },
		{ "FieldValueList", "リスト値" },
		{ "FieldWidth", "表示幅" },
		{ "FieldYearMonth", "年月" },
		{ "FieldZipNo", "郵便番号" },
		{ "File", "ファイル" },
		{ "FileSpecifiedNotFound", "有効な拡張子を持つ指定名のファイルが見つかりません。" },
		{ "FilterOfDetailList", "一覧検索条件フィールド" },
		{ "FilterOption", "検査オプション" },
		{ "Filters", "検索条件" },
		{ "FixedWhere", "固定Where" },
		{ "FixedWhereDTL", "明細固定Where" },
		{ "FixedWhereHDR", "見出し固定Where" },
		{ "Font", "フォント" },
		{ "FontSize", "サイズ" },
		{ "FontStyle", "スタイル" },
		{ "FontStyleBold", "太字" },
		{ "FontStyleBoldItalic", "太字斜字体" },
		{ "FontStyleItalic", "斜字体" },
		{ "FontStyleNormal", "通常" },
		{ "FontStyleUnderlined", "下線" },
		{ "FormatVersionError1", "このファイルのフォーマットバージョンは " },
		{ "FormatVersionError2", " ですが、このバージョンの ＸＥＡＤ Editor が扱えるのは " },
		{ "FormatVersionError3", " までです。最新の ＸＥＡＤ Editor をご利用ください。" },
		{ "FunctionDefinition", "機能定義" },
		{ "FunctionDefinitions", "機能定義" },
		{ "FunctionID", "機能ID" },
		{ "FunctionKeyNo", "機能キー��" },
		{ "FunctionKeys", "機能キー" },
		{ "FunctionList", "機能一覧" },
		{ "FunctionName", "機能名" },
		{ "FunctionsWhereUsed", "使途機能" },
		{ "FunctionType", "機能タイプ" },
		{ "FunctionTypeXF000", "XF000 Scriptランチャー" },
		{ "FunctionTypeXF010", "XF010 Scriptランチャー#1" },
		{ "FunctionTypeXF100", "XF100 明細一括表示" },
		{ "FunctionTypeXF110", "XF110 明細一括保守" },
		{ "FunctionTypeXF200", "XF200 単票表示保守" },
		{ "FunctionTypeXF210", "XF210 単票更新" },
		{ "FunctionTypeXF290", "XF290 単票印刷" },
		{ "FunctionTypeXF300", "XF300 見出し明細表示" },
		{ "FunctionTypeXF310", "XF310 見出し明細保守" },
		{ "FunctionTypeXF390", "XF390 見出し明細印刷" },
		{ "Function/AddRowListButton", "機能定義／追加行リストボタン" },
		{ "Function/AddRowListField", "機能定義／追加行リストフィールド" },
		{ "Function/BatchField", "機能定義／バッチフィールド" },
		{ "Function/Button", "機能定義／ボタン" },
		{ "Function/DTLButton", "機能定義／明細ボタン" },
		{ "Function/DTLField", "機能定義／明細フィールド" },
		{ "Function/DTLTab", "機能定義／明細タブ" },
		{ "Function/Field", "機能定義／フィールド" },
		{ "Function/Filter", "機能定義／フィルタ" },
		{ "Function/HDRField", "機能定義／見出しフィールド" },
		{ "Function/HDRPhrase", "機能定義／見出しフレーズ" },
		{ "Function/Phrase", "機能定義／フレーズ" },
		{ "GenerateList", "一覧出力" },
		{ "HDRData", "見出し情報" },
		{ "HDRField", "見出し域フィールド" },
		{ "HDRFields", "見出しフィールド" },
		{ "HDRFunctionID", "見出し処理機能ID" },
		{ "HDRTable", "見出しテーブル" },
		{ "HDRTableKeys", "見出しＫＥＹ" },
		{ "Height", "高さ" },
		{ "Help", "ヘルプ" },
		{ "HitCount", "Hit" },
		{ "ImageFolder", "画像フォルダ" },
		{ "Index", "インデックス" },
		{ "InitialMessage", "初期メッセージ" },
		{ "InitialReadCount", "初期表示件数" },
		{ "InitialValue", "初期値" },
		{ "JoinField", "結合フィールド" },
		{ "JoinFields", "結合フィールド" },
		{ "JoinOrderBy", "レコード検索順" },
		{ "JoinRecordExist", "レコード存在条件" },
		{ "JoinRecordOptional", "オプショナル" },
		{ "JoinTable", "結合テーブル" },
		{ "JoinTables", "結合テーブル" },
		{ "JoinTableWithAlias", "結合テーブル、エイリアス＝" },
		{ "JoinToKeys", "結合先KEY項目" },
		{ "JoinWithKeys", "結合元KEY項目" },
		{ "Jump", "ジャンプ" },
		{ "JumpTo1", "「" },
		{ "JumpTo2", "」へジャンプ" },
		{ "JumpToBookmark", "しおりへジャンプ" },
		{ "KeyFieldOfDTLTable", "明細テーブルの識別子" },
		{ "KeyFieldOfHDRTable", "見出しテーブルの識別子" },
		{ "KeyFieldOfPrimaryTable", "一次テーブルの識別子" },
		{ "KeyFields", "KEYフィールド" },
		{ "Keys", "ＫＥＹ" },
		{ "KeyType", "KEYタイプ" },
		{ "KeywordList", "Keyword一覧" },
		{ "Launch", "システム起動" },
		{ "LaunchSystemTitle", "現在のファイル内容が変更されています。実行の前に保存する必要があります。" },
		{ "LayoutHorizontal", "水平配置" },
		{ "LayoutOption", "配置オプション" },
		{ "LayoutVertical", "垂直配置" },
		{ "Lines", "行" },
		{ "List", "一覧" },
		{ "ListBox", "リストボックス" },
		{ "ListCsv", "CSV出力" },
		{ "ListingOperations", "検索対象操作" },
		{ "ListLog", "操作ログ" },
		{ "ListLogComment", "＊XEAD Driverが立ち上げたセッションの中で実行された操作のみが検索対象です。また、一意キー（またはその一部）の値指定がWHERE条件に含まれる操作のみが検索対象です。条件を設定して検索ボタンを押してください。" },
		{ "ListLogMessage1", "件の操作ログが見つかりました。行を選択すれば詳細が示されます。" },
		{ "ListLogMessage2", "条件に合う操作ログが見つかりません。" },
		{ "ListLogTitle", "テーブル操作ログ" },
		{ "ListTable", "リストテーブル" },
		{ "LoginScript", "ログインスクリプト" },
		{ "LoginTime", "ログイン日時" },
		{ "MainMenuEdit", "編集(E)" },
		{ "MainMenuFile", "ファイル(F)" },
		{ "MainMenuHelp", "ヘルプ(H)" },
		{ "MainMenuScan", "検索(S)" },
		{ "MainMenuTools", "ツール(T)" },
		{ "Menu", "メニュー" },
		{ "Menu/Option", "メニュー定義／オプション" },
		{ "MenuDefinitions", "メニュー定義" },
		{ "MenuHelpURL", "操作援助URL" },
		{ "MenuID", "メニューID" },
		{ "MenuList", "メニュー一覧" },
		{ "MenuName", "メニュー名" },
		{ "MenuOption", "メニューオプション" },
		{ "MenuOptionName", "オプション記述" },
		{ "MenuOptions", "メニューオプション" },
		{ "MenuTree", "メニューツリー" },
		{ "Message", "メッセージ" },
		{ "MinusRejectMessage", "この項目でのマイナス符号は無視されます。" },
		{ "ModuleCheck", "モジュールチェック" },
		{ "ModuleCheckMessage1", "フィールド " },
		{ "ModuleCheckMessage2", " の型が異なります。\n．．．定義上は" },
		{ "ModuleCheckMessage3", "ですが、モジュール上では" },
		{ "ModuleCheckMessage4", "です。\n" },
		{ "ModuleCheckMessage5", "フィールド " },
		{ "ModuleCheckMessage6", " は定義上は Null可で すが、モジュール上では Null不可 です。\n" },
		{ "ModuleCheckMessage7", "フィールド " },
		{ "ModuleCheckMessage8", " は定義上は Null不可で すが、モジュール上では Null可 です。\n" },
		{ "ModuleCheckMessage9", "フィールド " },
		{ "ModuleCheckMessage10", " がモジュール上に存在しません。\n" },
		{ "ModuleCheckMessage11", "モジュール上の更新排他制御用フィールド " },
		{ "ModuleCheckMessage12", " が INTEGER でなく" },
		{ "ModuleCheckMessage13", " です。\n" },
		{ "ModuleCheckMessage14", "更新排他制御用フィールド " },
		{ "ModuleCheckMessage15", " がモジュール上に存在しません。\n" },
		{ "ModuleCheckMessage16", "モジュール上にフィールド " },
		{ "ModuleCheckMessage17", " が未定義の物理フィールドとして存在します。\n" },
		{ "ModuleCheckMessage18", "モジュール上のユニークキー " },
		{ "ModuleCheckMessage19", " がテーブル定義上に設定されていません。\n" },
		{ "ModuleCheckMessage20", "モジュール上のインデックス " },
		{ "ModuleCheckMessage21", " がテーブル定義上に設定されていません。\n" },
		{ "ModuleCheckMessage22", "一次識別子の定義が異なります。定義上は " },
		{ "ModuleCheckMessage23", " ですが、モジュール上では " },
		{ "ModuleCheckMessage24", " です。\nモジュールが存在する場合に一次識別子の変更はできないため、モジュールをいったん削除する必要があります。\n" },
		{ "ModuleCheckMessage25", "二次識別子 " },
		{ "ModuleCheckMessage26", " の定義がモジュール上に存在しません。\n" },
		{ "ModuleCheckMessage27", "インデックス " },
		{ "ModuleCheckMessage28", " の定義がモジュール上に存在しません。\n" },
		{ "ModuleCheckMessage29", "定義上では一次識別子を伴いませんが、モジュール上では " },
		{ "ModuleCheckMessage30", " が一次識別子です。\n" },
		{ "ModuleCheckMessage31", "モジュールが存在しません。" },
		{ "ModuleCheckMessage32", "．．．定義を完成させたうえで「モジュール作成」を実行してください。" },
		{ "ModuleCheckMessage33", "．．．モジュールをいったん削除したうえで、あらたに作成する必要があります。" },
		{ "ModuleCheckMessage34", "．．．「モジュール修正」を実行すれば、モジュール上のフィールドが破棄または属性変更されます。型やサイズが変更される場合、フィールドデータが失われる点に注意してください。変更内容によっては１回で修正しきれないことがあります。その場合には、何度か実行してください。また、テーブルモジュール上の不要な二次識別子を除くためには、ＳＱＬコンソールを用いてテーブル制約のDROP操作を実行する必要があります。詳しくはHELPで確認してください。" },
		{ "ModuleCheckMessage35", "＊定義とモジュールは同期しています。再作成の必要はありません。" },
		{ "ModuleCheckMessage36", "既存のテーブルモジュールが定義にもとづいて\n修正されます。実行しますか？" },
		{ "ModuleCheckMessage37", "テーブルモジュールを修正できませんでした。\n\n" },
		{ "ModuleCheckMessage38", "物理フィールドを伴わないため、テーブルを作成できません。" },
		{ "ModuleCheckMessage39", "定義にもとづいてテーブルモジュールが新規作成されます。\n作成後に一次識別子を変更するためには、モジュールを\nいったん削除する必要があります。新規作成しますか？" },
		{ "ModuleCheckMessage40", "テーブルモジュールを作成できませんでした。\n\n" },
		{ "ModuleCheckMessage41", "既存のテーブルモジュールが削除\nされます。実行しますか？" },
		{ "ModuleCheckMessage42", "テーブルモジュールを削除できませんでした。" },
		{ "ModuleCheckMessage43", "＊定義にもとづいてテーブルモジュールが作成されました。" },
		{ "ModuleCheckMessage44", "＊定義とモジュールが同期されました。必要に応じてデータを修正してください。" },
		{ "ModuleCheckMessage45", "＊定義とモジュールは同期しています。再作成の必要はありませんが、XEAD Driverにおいて必要とされない外部キー制約がモジュールに組み込まれています。" },
		{ "ModuleCreate", "モジュール作成" },
		{ "ModuleDelete", "モジュール削除" },
		{ "ModuleModify", "モジュール修正" },
		{ "Name", "名称" },
		{ "NameDialogTitle", "XEAD Editor - フォルダとファイル名（漢字不可）を指定してください。" },
		{ "NewScript", "新規スクリプト" },
		{ "Next", "次へ" },
		{ "No", "いいえ" },
		{ "NoCaption", "キャプションなし" },
		{ "NoFieldsLeftToBeAdded", "追加可能なフィールド定義が残っていません。" },
		{ "None", "なし" },
		{ "NonEditable", "変更不可" },
		{ "Nullable", "NULL可" },
		{ "NullCheckMessage", "何らかの値を入力してください。" },
		{ "Open", "開く" },
		{ "OpenExistintContent", "既存のコンテンツファイルを開く" },
		{ "OpenMessage", "現在のファイル内容が変更されています。保存してから開きますか？" },
		{ "OpenNotSaving", "保存せずに開く" },
		{ "OpenSaving", "保存してから開く" },
		{ "OpenXEAFFile", "既存のxeafファイルを開く" },
		{ "OptionalList", "省略可リスト" },
		{ "OptionName", "オプション名" },
		{ "OrderByFields", "明細一覧順" },
		{ "OrderByOfDetailList", "明細データの一覧順序" },
		{ "OrderByOfJoinTable", "結合テーブルの読込順序" },
		{ "Output", "出力" },
		{ "OutputConfig", "出力設定" },
		{ "OutputFolder", "出力フォルダ" },
		{ "PageDirection", "用紙方向" },
		{ "PageMargins", "左右上下マージン" },
		{ "PageNo", "ページ番号出力" },
		{ "PageSize", "用紙サイズ" },
		{ "PanelSize", "パネルサイズ" },
		{ "Parameters", "パラメータ" },
		{ "Password", "パスワード" },
		{ "Paste", "貼り付け" },
		{ "PasteChild", "下位要素を貼り付け" },
		{ "PhraseBlock", "ブロック" },
		{ "PhraseFormula", "フレーズ式" },
		{ "PhraseSpacingAfter", "後スペース" },
		{ "PhysicalField", "物理フィールド" },
		{ "PKey", "一次識別子" },
		{ "Pos_short", "位置" },
		{ "Position", "位置" },
		{ "Previous", "戻る" },
		{ "PrimaryTable", "一次テーブル" },
		{ "PrintFont", "印刷用フォント名" },
		{ "Prompt", "プロンプタ" },
		{ "PrompterFunction", "関数検索" },
		{ "PrompterList", "リスト選択" },
		{ "RangeKeyField", "範囲KEY項目" },
		{ "RangeKeys", "範囲KEY項目" },
		{ "ReadCheckMessage", "件が読み取られました。オプションを選択してください。" },
		{ "ReadCheckTitle", "件数確認" },
		{ "ReadCountMessage", "件のデータが見つかりました。" },
		{ "ReadEmptyMessage", "テーブルは空です。" },
		{ "ReadEnd", "残りを読み込まない" },
		{ "ReadMore", "さらに読み込む" },
		{ "ReadNoneMessage", "条件に合うデータが見つかりません。" },
		{ "ReadOnlyWarning1", "指定されたファイルは読み取り専用です。XEAD Editorで編集" },
		{ "ReadOnlyWarning2", "しても、その内容を反映できない点にご注意ください。" },
		{ "Redo", "ノードに対する変更をやり直す" },
		{ "Remarks", "説明" },
		{ "RemoveRow", "行削除" },
		{ "ReplaceAllSelected", "選択行について一括置換" },
		{ "ReplaceFile", "上書き" },
		{ "ReplaceSaveMessage", "置換処理の結果を保存しますか？" },
		{ "ReplaceSaveTitle", "XEAD Editor - 置換結果の保存確認" },
		{ "RequiredList", "強制リスト" },
		{ "Result", "結果" },
		{ "RetrieveLog", "操作ログの検索" },
		{ "Return", "終了" },
		{ "ReturnFields", "返しフィールド" },
		{ "RowAction", "明細選択時" },
		{ "RowActionCall", "機能を起動" },
		{ "RowActionReturn", "起動元に返す" },
		{ "RowNoWidth", "行�ｕ摧范ｦ" },
		{ "Save", "保存" },
		{ "SaveAs", "別名で保存" },
		{ "SaveAsThis", "この名前で保存" },
		{ "SaveChanges", "保存する" },
		{ "SaveChangesTitle", "XEAD Editor - 変更の保存" },
		{ "Scan", "走査" },
		{ "ScanDialogComment1", "Editorで編集可能な定義要素のみ検索され、IDやテーブルエイリアスといった編集不可項目は除外される点に注意してください。" },
		{ "ScanDialogComment2", "個の定義要素の、" },
		{ "ScanDialogComment3", "箇所で指定文字列が見つかりました。行を選択すれば属性値が示されます。" },
		{ "ScanDialogComment4", "指定文字列を含む定義要素は見つかりませんでした。" },
		{ "ScanDialogComment5", "個の定義要素の、" },
		{ "ScanDialogComment6", "箇所で指定文字列が置換されました。" },
		{ "ScanDialogTitle", "文字列の走査・置換" },
		{ "ScanMessage", "現在のファイル内容が変更されています。検索・置換の前に保存する必要があります。" },
		{ "ScanRange", "走査範囲" },
		{ "ScanReplace", "文字列の走査・置換" },
		{ "ScanStart", "走査開始" },
		{ "ScanString", "走査文字列" },
		{ "ScanStringInScript", "走査文字列（F3でカーソル位置から走査開始）" },
		{ "ScanStringInScriptMessage", "指定文字列が見つかりません。" },
		{ "ScanStringReplacedTo", "置換文字列" },
		{ "Script", "スクリプト" },
		{ "ScriptChangesMessage", "スクリプトの編集結果を保存しますか？" },
		{ "ScriptNotesTitle1", "■フィールド値変数一覧" },
		{ "ScriptNotesTitle2", "\n\n■結合フィールド値変数一覧" },
		{ "ScriptNotesTitle3", "\n\n■変数名凡例\n[TableID]_[FieldID].value : フィールド値\n[TableID]_[FieldID].oldValue : 更新前のフィールド値。読取専用\n[TableID]_[FieldID].color : 表示色(black,green,blue,red,orange)\n[TableID]_[FieldID].editable : 編集設定(true,false)\n[TableID]_[FieldID].error : エラーメッセージ\n（セッションオブジェクトや機能オブジェクトも利用可能です。\n詳細についてはヘルプで確認してください）" },
		{ "ScriptNotesVFMark", "(仮) " },
		{ "Scripts", "スクリプト" },
		{ "Sel", "選" },
		{ "SelectContent", "XEAD Editor - 編集ファイルの選択" },
		{ "SelectFile", "ファイルを選んで開く" },
		{ "SelectFromList", "（選択してください）" },
		{ "SelectList", "選択リスト" },
		{ "SessionNo", "セッション��" },
		{ "SizeAuto", "自動設定" },
		{ "SizeFull", "全画面" },
		{ "SizeSpecified", "指定値（横縦）" },
		{ "SKey", "二次識別子" },
		{ "SpecifyName", "ファイル名の再指定" },
		{ "SpecifyNewID", "新たなＩＤを指定してください。" },
		{ "SpecifyNewIDOfTable", "結合テーブル／フィールドとスクリプトはコピーされません。\n新たなテーブルＩＤを指定してください。" },
		{ "SqlCommitF9", "実行  F9" },
		{ "SqlConsole", "SQLコンソール" },
		{ "SqlConsoleComment", "＊ＳＱＬステートメントの他、システム組込プロシージャも実行できます。ただし、ここでCREATE TABLEを実行しても、テーブル定義は設計情報として追加されません。テーブル定義を作成したい場合には「ツール｜テーブル定義作成」を用いてください。\n" },
		{ "SqlConsoleMessage1", "・・・正常に実行されました。\n(" },
		{ "SqlConsoleMessage2", "操作に失敗しました。" },
		{ "Status", "状況" },
		{ "Subsystem", "サブシステム定義" },
		{ "SubsystemDescriptions", "サブシステム記述" },
		{ "SubsystemFunctions", "機" },
		{ "SubsystemID", "サブシステムID" },
		{ "SubsystemList", "サブシステム一覧" },
		{ "SubsystemName", "サブシステム名" },
		{ "SubsystemRemarks", "サブシステムの説明" },
		{ "SubsystemTables", "表" },
		{ "System", "システム定義" },
		{ "SystemCalendar", "休日テーブル" },
		{ "SystemConfig", "基本設定" },
		{ "SystemCurrency", "通貨" },
		{ "SystemCurrencyDetail", "通貨明細" },
		{ "SystemDefinition", "システム定義" },
		{ "SystemDescriptions", "システム記述" },
		{ "SystemName", "システム名" },
		{ "SystemName", "システム名" },
		{ "SystemNumbering", "採番テーブル" },
		{ "SystemRemarks", "システムの説明" },
		{ "SystemSession", "セッション" },
		{ "SystemSessionDetail", "セッション明細" },
		{ "SystemTax", "消費税" },
		{ "SystemUser", "ユーザ情報" },
		{ "SystemUserVariants", "ユーザ変数" },
		{ "SystemVariants", "システム変数" },
		{ "SystemVersion", "バージョン" },
		{ "Table", "テーブル" },
		{ "TableDefinition", "テーブル定義" },
		{ "TableDefinitions", "テーブル定義" },
		{ "Table/Field", "テーブル定義／フィールド" },
		{ "Table/Script", "テーブル定義／スクリプト" },
		{ "TableID", "テーブルID" },
		{ "TableList", "テーブル一覧" },
		{ "TableModuleCheck", "モジュールチェック" },
		{ "TableName", "テーブル名" },
		{ "TableOperation", "テーブル操作" },
		{ "TableUsageInScript1", "スクリプト「" },
		{ "TableUsageInScript2", "」での操作(" },
		{ "TableUsageInScript3", ")" },
		{ "TableUsageInScript4", "スクリプトでの操作(" },
		{ "Text", "テキスト" },
		{ "TimerDefault", "時刻初期値" },
		{ "TimerMessage", "メッセージ" },
		{ "TimerOption", "タイマー" },
		{ "TimerOptionYes", "使う" },
		{ "TipsFunction", "機能の所属サブシステムは変更可能です。ツリービューの別の\nサブシステム下の機能ノードをここにドラッグ＆ドロップすれば、\nこのサブシステムに所属する定義として変更されます。" },
		{ "TipsMenu", "ツリービューの機能ノードをここにドラッグ＆ドロップ\nすれば、このメニューのオプションとして組み込まれます。" },
		{ "TipsTable", "テーブルの所属サブシステムは変更可能です。ツリービューの\n別のサブシステム下のテーブルノードをここにドラッグ＆ドロップ\nすれば、このサブシステムに所属する定義として変更されます。" },
		{ "TipsTitle", "編集のヒント" },
		{ "TipsToEdit", "編集のヒント" },
		{ "Tools", "ツール" },
		{ "Type", "タイプ" },
		{ "TypeOptions", "タイプオプション" },
		{ "Undo", "ノードに対する変更を取り消す" },
		{ "Update", "更新" },
		{ "UpdateCounter", "更新排他制御" },
		{ "UpdateList", "更新リスト" },
		{ "UpdateMessage", "更新前メッセージ" },
		{ "UsageBatchFieldPrompter", "バッチフィールドプロンプタ" },
		{ "UsageColumnPrompter", "明細フィールドプロンプタ" },
		{ "UsageDTLFunction", "明細呼出機能" },
		{ "UsageFieldPrompter", "フィールドプロンプタ" },
		{ "UsageHDRFunction", "見出し呼出機能" },
		{ "UsageLaunchedAfterInsert", "追加後呼出機能" },
		{ "UsageLaunchedByBatchRecord", "バッチレコード処理機能" },
		{ "UsageLaunchedByFunctionKey", "機能キー呼出機能" },
		{ "UsageLaunchedByRow", "明細呼出機能" },
		{ "UsageLaunchedInScript", "スクリプト呼出機能" },
		{ "User", "ユーザ" },
		{ "UserID", "ユーザID" },
		{ "ValueSpecified", "指定値" },
		{ "VariantNameOnScript", "スクリプト上の変数名" },
		{ "Virtual", "仮想" },
		{ "WarningMessage1", "警告：この結合フィールドのデータソース名が、バッチテーブル上で\n重複しています。詳細はHELPで確認してください。" },
		{ "WarningMessage2", "警告：この結合フィールドのデータソース名が、一次テーブル上で\n重複しています。詳細はHELPで確認してください。" },
		{ "WarningMessage3", "警告：この結合フィールドのデータソース名が、明細テーブル上で\n重複しています。詳細はHELPで確認してください。" },
		{ "WarningMessage4", "警告：この結合フィールドのデータソース名が、見出しテーブル上で\n重複しています。詳細はHELPで確認してください。" },
		{ "WelcomePageURL", "メニュー用URL" },
		{ "WhereUsed", "使途要素" },
		{ "WhereUsedForm", "利用形式" },
		{ "Width", "幅" },
		{ "WidthRate", "幅比率" },
		{ "WithTotal", "合計出力" },
		{ "XLSComment", "＊この一覧は次の条件で絞込み、または並び順の指定がなされています：" },
		{ "XLSErrorMessage", "エクセルデータの出力エラーが発生しました。" },
		{ "XLSFontDTL", "ＭＳ Ｐ明朝" },
		{ "XLSFontHDR", "ＭＳ Ｐゴシック" },
		{ "Yes", "はい" }
	};

	public Object[][] getContents() {
		return contents;
	}
}
