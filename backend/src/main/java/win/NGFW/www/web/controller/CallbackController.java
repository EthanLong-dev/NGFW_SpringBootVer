package win.NGFW.www.web.controller;

import com.google.api.client.auth.oauth2.AuthorizationCodeFlow;
import com.google.api.client.auth.oauth2.AuthorizationCodeResponseUrl;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.servlet.auth.oauth2.AbstractAuthorizationCodeCallbackServlet;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.client.util.store.DataStoreFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

@WebServlet("/callback")
public class CallbackController extends AbstractAuthorizationCodeCallbackServlet {
    private static final long serialVersionUID = 1L;
    private static final String CLIENT_ID = "";
    private static final String CLIENT_SECRET = "";
    private static final java.io.File DATA_STORE_DIR = new java.io.File("credentials");
    private static final DataStoreFactory DATA_STORE_FACTORY;

    static {
        try {
            DATA_STORE_FACTORY = new FileDataStoreFactory(DATA_STORE_DIR);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void onSuccess(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp, Credential credential) throws IOException {
        req.getSession().setAttribute("credential", credential);
        resp.sendRedirect("http://www.tia202g1.win/NGFW/login.html");
    }

    @Override
    protected void onError(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp, AuthorizationCodeResponseUrl errorResponse) {
        System.out.println(errorResponse.getError());
    }

    @Override
    protected AuthorizationCodeFlow initializeFlow() throws IOException {
        Set<String> scopes = new HashSet<>();
        scopes.add("email");
        scopes.add("profile");
        return new GoogleAuthorizationCodeFlow.Builder(
            new NetHttpTransport(),
            GsonFactory.getDefaultInstance(),
            CLIENT_ID,
            CLIENT_SECRET,
            scopes
        )
            .setDataStoreFactory(DATA_STORE_FACTORY).setAccessType("offline").build();
    }

    @Override
    protected String getRedirectUri(javax.servlet.http.HttpServletRequest httpServletRequest) {
        GenericUrl url = new GenericUrl(httpServletRequest.getRequestURL().toString());
        url.setRawPath("/NGFW/callback");
        return url.build();
    }

    @Override
    protected String getUserId(javax.servlet.http.HttpServletRequest req) throws javax.servlet.ServletException, IOException {
        return req.getSession().getId();
    }
}
