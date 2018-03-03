package pl.piomin.microservices.account.model;

public class Document {

	private int documentId;
	private int accountId;
	private String  documentName;

	public Document() {

	}

	public Integer getDocumentId() {
		return documentId;
	}

	public Document(int documentId, int accountId, String documentName) {
		super();
		this.documentId = documentId;
		this.accountId = accountId;
		this.documentName = documentName;
	}

	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	

}
