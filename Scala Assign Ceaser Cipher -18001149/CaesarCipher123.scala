import scala.collection.mutable.ListBuffer

object CaesarCipher123 extends App {

 

  def encriptMsg(shiftn :Int, encMsg : String ):String = {
  
	//Lets Encrypt/Decrypt the code
	var outputString = encMsg.map( (h: Char) => { 

		//We find the h char in our introdued alphabet
		val x = alphabet.indexOf(h.toUpper)

		//If it char h is not in the Alphabet then we leave it else we encrypt it.
		if (x == -1){
			h
		}
		else{
			alphabet((x + shiftn) % alphabet.size)
			} 
	});
	
       var Encrypt:String= outputString;
	//Print the result
	  return Encrypt;
	
	}
	
	def decriptMsg(shiftno : Int, decMsg : String ): String ={
	
	var decryptText = decMsg.map( (m: Char) => { 


		//We find the y char in our introdued alphabet
		val y = alphabet.indexOf(m.toUpper)

		//If m char is not in the alphabetit is not then we leave it .
		if (y == -1){
			m
		}
		else{
			alphabet((y + shiftno) % alphabet.size)
			} 
	});
	
	   var Decrypt:String=decryptText;
	   return Decrypt;
	}
	
	println("..............Caesar Cipher For Data Encryption and Decryption..............")
val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

 //What is the message we want to encrypt
val inputText = scala.io.StdIn.readLine("Secret Message: ")		
	
val key = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size		

			var list:String =encriptMsg(key,inputText);
			println(" The Encrypt Message: " ,list );
	//Key1 should be the negative number of the shifted number.So you need to put negative value of the shift/key when u decrypt
val key1 = (scala.io.StdIn.readLine("Decrypt Shift By (Put the negative number of the Shift) : ").toInt + alphabet.size) % alphabet.size	
	var encryptText:String = list;
	//var encryptText = scala.io.StdIn.readLine("Encrypt Message: ")
			
			//What is the code we want to decrypt
		     val declist:String =decriptMsg(key1,encryptText);		  
		   println(" The Decrypt Message: ",declist);
	

}		
