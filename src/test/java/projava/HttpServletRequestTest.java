package projava;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import javax.servlet.http.HttpServletRequest;
import org.mockito.Mockito;

public class HttpServletRequestTest {

    @Test
    public void testHttpServletRequestMock() {
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);

        // 例: モックされたリクエストに対して動作を定義する
        Mockito.when(request.getParameter("name")).thenReturn("John");

        // 例: モックされたリクエストから値を取得する
        String name = request.getParameter("name");

        // 例: 検証
        Assertions.assertEquals("John", name);
    }
}
