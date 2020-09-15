package ObjectStreamDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 对象的序列化和反序列化操作
 * 前提：对象必须实现serializable序列化接口
 * @todo TODO
 * @author Jaden
 * @date 2020年2月20日,上午11:57:10
 * @copyright Jaden
 */
public class objectStreamDemo {
	private static final String FilePath = "src/ObjectStreamDemo/Object.dat";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player1 = new Player("lover1",23);
		//使用对象流，将序列化的对象写入文件
		try(FileOutputStream fOStream = new FileOutputStream(FilePath);
			ObjectOutputStream objOutStream = new ObjectOutputStream(fOStream);
				){
			objOutStream.writeObject(player1);
			System.out.println("对象写入成功！");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		//从文件中读取对象内容，转换成可操作对象
		try(FileInputStream fInStream = new FileInputStream(FilePath);
				ObjectInputStream objInStream = new ObjectInputStream(fInStream);) 
		{
			Player player2 = (Player)objInStream.readObject();
			System.out.println("读取出来的内容："+player2);
			System.out.println(player1 == player2); //false 比较的时地址
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

class Player implements Serializable{


	private static final long serialVersionUID = -6933961739543761153L;
	private String nickName;
	private int level;
	
	public Player(){}
	
	public Player(String nickName, int level) {
		setNickName(nickName);
		setLevel(level);
	}
	
	@Override
	public String toString() {
		return nickName + "\t" + level;
	}
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	
}