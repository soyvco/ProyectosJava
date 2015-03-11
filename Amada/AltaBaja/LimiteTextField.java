package AltaBaja;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.Segment;

public class LimiteTextField implements Document
{
   public int limite=0;
   
   public LimiteTextField(int pI)
   {
      this.limite=pI;
   }
   
   public int getLength()
   {
      return 0;
   }
   
   public void addDocumentListener(DocumentListener pListener)
   {
   }
   
   public void removeDocumentListener(DocumentListener pListener)
   {
   }
   
   public void addUndoableEditListener(UndoableEditListener pListener)
   {
   }
   
   public void removeUndoableEditListener(UndoableEditListener pListener)
   {
   }
   
   public Object getProperty(Object pKey)
   {
      return null;
   }
   
   public void putProperty(Object pKey,Object pValue)
   {
   }
   
   public void remove(int pOffs,int pLen) throws BadLocationException
   {
   }
   
   public void insertString(int pOffset,String pStr,AttributeSet pA) throws BadLocationException
   {
   }
   
   public String getText(int pOffset,int pLength) throws BadLocationException
   {
      return null;
   }
   
   public void getText(int pOffset,int pLength,Segment pTxt) throws BadLocationException
   {
   }
   
   public Position getStartPosition()
   {
      return null;
   }
   
   public Position getEndPosition()
   {
      return null;
   }
   
   public Position createPosition(int pOffs) throws BadLocationException
   {
      return null;
   }
   
   public Element[] getRootElements()
   {
      return null;
   }
   
   public Element getDefaultRootElement()
   {
      return null;
   }
   
   public void render(Runnable pR)
   {
   }
}
