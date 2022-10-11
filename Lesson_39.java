package Week3;

public class Lesson_39 {

	public static void main(String[] args) {
	BaseKrediManager[] krediManagers = new BaseKrediManager[] {new OgretmenKrediManager(), new TarimKrediManager(), new OgrencKrediManager()};
	for (BaseKrediManager krediManager: krediManagers) {
		System.out.println(krediManager.hesapla(1000));
	}
	
		}
		

}
