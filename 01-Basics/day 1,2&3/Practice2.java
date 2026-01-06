public class Practice2 {
    public static void main(String[] args) {
      char grade = 'B';
      char encryptedGrade = (char) (grade + 8);
      System.out.println("EncryptedGrade is:" + encryptedGrade);
      char decryptedGrade = (char) (encryptedGrade - 8);
      System.out.println("DecryptedGrade is:" + decryptedGrade);

    }       
    
}
