import com.github.mizosoft.methanol.BodyDecoder;

module methanol {
  requires java.net.http;
  requires org.checkerframework.checker.qual;

  exports com.github.mizosoft.methanol;

  uses BodyDecoder.Factory;
}