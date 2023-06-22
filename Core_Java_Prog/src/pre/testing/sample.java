package pre.testing;
/*package testing;

import javax.websocket.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URI;
import java.net.URLConnection;

@ClientEndpoint
public class sample {

	private String uri = "ws://localhost:8080/iot_socket_service/socket/";
	private Session userSession = null;
	private String answer;

	public sample() {
		
	}

	public void connect() {
		try {
			WebSocketContainer container = ContainerProvider.getWebSocketContainer();
			container.connectToServer(this, new URI(uri));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
    }

	public boolean isClosed() {
		return userSession == null || !userSession.isOpen();
	}

	@OnOpen
	public void onOpen(Session userSession) {
		this.userSession = userSession;
		System.out.println("Connection opened");
	}

	@OnClose
	public void onClose(Session userSession, CloseReason reason) {
		this.userSession = null;
		System.out.println("Connection closed");
	}

	@OnMessage
	public void onMessage(String message) {
		this.answer = message;
		System.out.println("Received message : " + message);
	}

	public String getAnswer() {
		return answer;
	}

	public void sendMessage(String message) {
		if (userSession != null && userSession.isOpen())
			try {
				this.userSession.getBasicRemote().sendText(message);
			} catch (IOException e) {
				e.printStackTrace();
			}
		else {
			System.out.println("Session closed!");
		}
	}

	public void reset() {;
		this.answer = null;
	}

	public static void main(String args[]) throws IOException {
		WebsocketClient client = new WebsocketClient();
		client.connect();
	}
}
*/