package serializacao;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class writeSerializableClass
{
	public static void main(String...arg) throws Exception
	{
		empregado empregado = new empregado();
		
		empregado.setCpf(12345678);
		empregado.setEndereco("Rua wololo");
		empregado.setNome("semnome");
		empregado.setNumero(221);
		
		FileOutputStream fos = new FileOutputStream("writeSerializable.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(empregado);
		oos.close();
	}
}
