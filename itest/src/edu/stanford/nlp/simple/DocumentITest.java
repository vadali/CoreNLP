package edu.stanford.nlp.simple;

import edu.stanford.nlp.hcoref.data.CorefChain;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * A test for {@link edu.stanford.nlp.simple.Document}, using the NLP models.
 *
 * @author Gabor Angeli
 */
public class DocumentITest {

  @Test
  public void testCoref() {
    Document doc = new Document("John Bauer walked his dog, Cirrus.");
    assertNotNull(doc);
    Map<Integer, CorefChain> corefChains = doc.coref();
    assertNotNull(corefChains);
    assertTrue(corefChains.size() > 0);
  }
}
