
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class GmailCredentialsTest {
    @Test
    public void setUser() {
        GmailCredentials.getInstance().setUser("yangianini@gmail.com");
        assertEquals("yangianini@gmail.com", GmailCredentials.getInstance().getUser());
    }

    @Test
    public void setPassword() {
        GmailCredentials.getInstance().setPassword("segredo");
        assertEquals("segredo", GmailCredentials.getInstance().getPassword());
    }

    @Test
    public void setAppKey() {
        GmailCredentials.getInstance().setAppKey("iwjslsanlkandlw");
        assertEquals("iwjslsanlkandlw", GmailCredentials.getInstance().getAppKey());
    }
}
