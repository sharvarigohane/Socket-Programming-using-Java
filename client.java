import java.io.*;
import java.net.*;
public class MyServer {
public static void main(String[] args){
try{
ServerSocket ss=new ServerSocket(6666);
Socket s=ss.accept();//establishes connection
DataInputStream dis=new DataInputStream(s.getInputStream());
String str=(String)dis.readUTF();
for(int i=0;i<str.lenght();i++)
{
char ch=str.charAt(i);
ch=(char)(ch-32);
System.out.print(ch);
}ss.close();
}catch(Exception e){System.out.println(e);}
}
}