package poke.server.conf;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "nextNearest")
@XmlAccessorType(XmlAccessType.FIELD)
public class NodeDescription {
	private String nodeId;
	private String host;
	private int port;
	private int mgmtPort;
    private String leaderId;

    public String getLeaderId() { return leaderId; }

    public void setLeaderId(String leaderId) { this.leaderId = leaderId; }

    public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int getMgmtPort() {
		return mgmtPort;
	}

	public void setMgmtPort(int mgmtPort) {
		this.mgmtPort = mgmtPort;
	}

}
