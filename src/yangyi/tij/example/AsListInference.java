package yangyi.tij.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;


class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}
public class AsListInference {

	public static void main(String[] args) {
		List<Snow> snow1=Arrays.asList(new Crusty(),new Slush(),new Powder());

		List<Snow> snow2=Arrays.asList(new Light(),new Heavy());
		
		
	}

}
