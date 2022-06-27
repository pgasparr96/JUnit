package teste.aula_junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
	
	//Adultos
	
	@Test
	public void testeBaixoPesoMuitoGraveAdulto20() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso muito grave Adulto 20", calc.calcularImc(51, 1.79, 20, "m"));
	}
	
	@Test
	public void testeBaixoPesoMuitoGraveAdulto65() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso muito grave Adulto 65", calc.calcularImc(51, 1.79, 65, "m"));
	}
	
	@test
	public void testeBaixoPesoGraveAdulto20LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso grave adulto 20", calc.calcularImc(49, 1.75, 20, "m"));
	}
	
	@test
	public void testeBaixoPesoGraveAdulto65LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso grave adulto 65", calc.calcularImc(49, 1.75, 65, "m"));
	}
	
	@test
	public void testeBaixoPesoGraveAdulto20LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso grave adulto 20", calc.calcularImc(49, 1.70, 20, "m"));
	}
	
	@test
	public void testeBaixoPesoGraveAdulto65LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso grave adulto 65", calc.calcularImc(49, 1.75, 65, "m"));
	}
	
	@test
	public void testeBaixoPesoAdulto20LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso adulto 20", calc.calcularImc(41, 1.55, 20, "m"));
	}
	
	@test
	public void testeBaixoPesoAdulto65LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso adulto 65", calc.calcularImc(41, 1.55, 65, "m"));
	}
	
	@test
	public void testeBaixoPesoAdulto20LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso adulto 20", calc.calcularImc(46, 1.58, 20, "m"));
	}
	
	@test
	public void testeBaixoPesoAdulto65LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso adulto 65", calc.calcularImc(46, 1.58, 65, "m"));
	}
	
	@test
	public void testePesoNormalAdulto20LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal adulto 20", calc.calcularImc(47, 1.59, 20, "m"));
	}
	
	@test
	public void testePesoNormalAdulto65LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal adulto 65", calc.calcularImc(47, 1.59, 65, "m"));
	}
	
	@test
	public void testePesoNormalAdulto20LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal adulto 20", calc.calcularImc(68, 1.65, 20, "m"));
	}
	
	@test
	public void testePesoNormalAdulto65LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal adulto 65", calc.calcularImc(68, 1.65, 65, "m"));
	}
	
	@test
	public void testeSobrepesoAdulto20LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso adulto 20", calc.calcularImc(74, 1.72, 20, "m"));
	}
	
	@test
	public void testeSobrepesoAdulto65LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso adulto 65", calc.calcularImc(74, 1.72, 65, "m"));
	}
	
	@test
	public void testeSobrepesoAdulto20LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso adulto 20", calc.calcularImc(98, 1.81, 20, "m"));
	}
	
	@test
	public void testeSobrepesoAdulto65LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso adulto 65", calc.calcularImc(98, 1.81, 65, "m"));
	}
	
	@test
	public void testeObesidadeGrau1Adulto20LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Grau 1 adulto 20", calc.calcularImc(103, 1.85, 20, "m"));
	}
	
	@test
	public void testeObesidadeGrau1Adulto65LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Grau 1 adulto 65", calc.calcularImc(103, 1.85, 65, "m"));
	}
	
	@test
	public void testeObesidadeGrau1Adulto20LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Grau 1 adulto 20", calc.calcularImc(125, 1.89, 20, "m"));
	}
	
	@test
	public void testeObesidadeGrau1Adulto65LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Grau 1 adulto 65", calc.calcularImc(125, 1.89, 65, "m"));
	}
	
	@test
	public void testeObesidadeGrau2Adulto20LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Grau 2 adulto 20", calc.calcularImc(111, 1.78, 20, "m"));
	}
	
	@test
	public void testeObesidadeGrau2Adulto65LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Grau 2 adulto 65", calc.calcularImc(111, 1.78, 65, "m"));
	}
	
	@test
	public void testeObesidadeGrau2Adulto20LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Grau 2 Adulto 20", calc.calcularImc(101, 1.59, 20, "m"));
	}
	
	@test
	public void testeObesidadeGrau2Adulto65LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Grau 2 Adulto 65", calc.calcularImc(101, 1.59, 65, "m"));
	}
	
	@test
	public void testeObesidadeGrau3Adulto20() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Grau 3 adulto 20", calc.calcularImc(117, 1.71, 20, "m"));
	}
	
	@test
	public void testeObesidadeGrau3Adulto65() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Grau 3 adulto 65", calc.calcularImc(117, 1.71, 65, "m"));
	}
	
	//Idosos
	
	@test
	public void testeBaixoPesoIdosa() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Idosa Baixo Peso", calc.calcularImc(59, 1.64));
	}
	
	@test
	public void testePesoNormalIdosaLimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("idosa Peso Normal", calc.calcularImc(55, 1.58));
	}
	
	@test
	public void testePesoNormalIdosaLimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("idosa Peso Normal", calc.calcularImc(69, 1.60));
	}
	
	@test
	public void testeSobrepesoIdosaLimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("idosa Sobrepeso", calc.calcularImc(72, 1.63));
	}
	
	@test
	public void testeSobrepesoIdosaLimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("idosa Sobrepeso", calc.calcularImc(86, 1.64));
	}
	
	@test
	public void testeObesidadeGrau1IdosaLimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("idosa Obesidade grau 1", calc.calcularImc(96, 1.73));
	}
	
	@test
	public void testeObesidadeGrau1IdosaLimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("idosa Obesidade Grau 1", calc.calcularImc(111, 1.71));
	}
	
	@test
	public void testeObesidadeGrau2IdosaLimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 2 idosa", calc.calcularImc(94, 1.59));
	}
	
	@test
	public void testeObesidadeGrau2IdosaLimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Grau 2 idosa", calc.calcularImc(110, 1.62));
	}
	
	@test
	public void testeObesidadeGrau3Idosa() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Grau 3 idosa", calc.calcularImc(105, 1.58));
	}
	
	@test
	public void testeBaixoPesoIdoso() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("baixo Peso idoso", calc.calcularImc(59, 1.64));
	}
	
	@test
	public void testePesoNormalIdosoLimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso normal idoso Limite Minimo", calc.calcularImc(55, 1.58));
	}
	
	@test
	public void testePesoNormalIdosoLimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso normal idoso limite Maximo", calc.calcularImc(69, 1.60));
	}
	
	@test
	public void testeSobrepesoIdosoLimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso idoso LimiteMinimo", calc.calcularImc(74, 1.65));
	}
	
	@test
	public void testeSbrepesoIdosoLimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso idoso LimiteMaximo", calc.calcularImc(95, 1.78));
	}
	
	@test
	public void testeObesidadeGrau1IdosoLimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 1 idoso LimiteMinimo", calc.calcularImc(90, 1.73));
	}
	
	@test
	public void testeObesidadeGrau1IdosoLimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Grau1 idoso LimiteMaximo", calc.calcularImc(93, 1.63));
	}
	
	@test
	public void testeObesidadeGrau2IdosoLimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 2 idoso LimiteMinimo", calc.calcularImc(99, 1.68));
	}
	
	@test
	public void testeObesidadeGrau2IdosoLimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Grau 2 idoso LimiteMaximo", calc.calcularImc(131, 1.81));
	}
	
	@test
	public void testeObesidadeGrau3Idoso() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Grau 3 idoso LimiteMinimo", calc.calcularImc(120, 1.173));
	}
	
	// Crianças
	
	@test
	public void testeBaixoPesoCriancaMenino2Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso Criança Menino 2 anos", calc.calcularImc(11, 0.87, 2, "m"));
	}
	
	@test
	public void testePesoNormalCriancaMenino2Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal Crianca Menino 2 anos", calc.calcularImc(12, 0.88, 2, "m"));
	}
	
	@test
	public void testeSobrepesoCriancaMenino2Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso Crianca Menino 2 anos", calc.calcularImc(16, 0.89, 2, "m"));
	}
	
	@test
	public void testeObesidadeCriancaMenino2Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Crianca Menino 2 anos", calc.calcularImc(17, 0.89, 2, "m"));
	}
	
	@test
	public void testeBaixoPesoCriancaMenino4Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso Criança Menino 4 anos", calc.calcularImc(15, 1.04, 4, "m"));
	}
	
	@test
	public void testePesoNormalCriancaMenino4Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal Crianca Menino 4 anos", calc.calcularImc(18, 1.03, 4, "m"));
	}
	
	@test
	public void testeSobrepesoCriancaMenino4Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso Crianca Menino 4 anos", calc.calcularImc(18, 1.01, 4, "m"));
	}
	
	@test
	public void testeObesidadeCriancaMenino4Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Crianca Menino 4 anos", calc.calcularImc(20, 1.05, 4, "m"));
	}
	
	@test
	public void testeBaixoPesoCriancaMenino6Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso Criança Menino 6 anos", calc.calcularImc(18, 1.15, 6, "m"));
	}
	
	@test
	public void testePesoNormalCriancaMenino6Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal Crianca Menino 6 anos", calc.calcularImc(20, 1.18, 6, "m"));
	}
	
	@test
	public void testeSobrepesoCriancaMenino6Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso Crianca Menino 6 anos", calc.calcularImc(23, 1.16, 6, "m"));
	}
	
	@test
	public void testeObesidadeCriancaMenino6Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Crianca Menino 6 anos", calc.calcularImc(26, 1.17, 6, "m"));
	}
	
	@test
	public void testeBaixoPesoCriancaMenino8Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso Criança Menino 8 anos", calc.calcularImc(22, 1.26, 8, "m"));
	}
	
	@test
	public void testePesoNormalCriancaMenino8Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal Crianca Menino 8 anos", calc.calcularImc(28, 1.26, 8, "m"));
	}
	
	@test
	public void testeSobrepesoCriancaMenino8Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso Crianca Menino 8 anos", calc.calcularImc(31, 1.26, 8, "m"));
	}
	
	@test
	public void testeObesidadeCriancaMenino8Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Crianca Menino 8 anos", calc.calcularImc(33, 1.26, 8, "m"));
	}
	
	@test
	public void testeBaixoPesoCriancaMenino10Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso Criança Menino 10 anos", calc.calcularImc(30, 1.46, 10, "m"));
	}
	
	@test
	public void testePesoNormalCriancaMenino10Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal Crianca Menino 10 anos", calc.calcularImc(39, 1.46, 10, "m"));
	}
	
	@test
	public void testeSobrepesoCriancaMenino10Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso Crianca Menino 10 anos", calc.calcularImc(44, 1.46, 10, "m"));
	}
	
	@test
	public void testeObesidadeCriancaMenino10Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Crianca Menino 10 anos", calc.calcularImc(48, 1.46, 10, "m"));
	}
	
	@test
	public void testeBaixoPesoCriancaMenino12Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso Criança Menino 12 anos", calc.calcularImc(38, 1.61, 12, "m"));
	}
	
	@test
	public void testePesoNormalCriancaMenino12Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal Crianca Menino 12 anos", calc.calcularImc(54, 1.61, 12, "m"));
	}
	
	@test
	public void testeSobrepesoCriancaMenino12Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso Crianca Menino 12 anos", calc.calcularImc(54, 1.60, 12, "m"));
	}
	
	@test
	public void testeObesidadeCriancaMenino12Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Crianca Menino 12 anos", calc.calcularImc(66, 1.60, 12, "m"));
	}
	
	@test
	public void testeBaixoPesoCriancaMenino14Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso Criança Menino 14 anos", calc.calcularImc(42, 1.64, 14, "m"));
	}
	
	@test
	public void testePesoNormalCriancaMenino14Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal Crianca Menino 14 anos", calc.calcularImc(61, 1.64, 14, "m"));
	}
	
	@test
	public void testeSobrepesoCriancaMenino14Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso Crianca Menino 14 anos", calc.calcularImc(69, 1.63, 14, "m"));
	}
	
	@test
	public void testeObesidadeCriancaMenino14Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Crianca Menino 14 anos", calc.calcularImc(79, 1.64, 14, "m"));
	}
	
	@test
	public void testeBaixoPesoCriancaMenino16Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso Criança Menino 16 anos", calc.calcularImc(47, 1,67, 16, "m"));
	}
	
	@test
	public void testePesoNormalCriancaMenino16Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal Crianca Menino 16 anos", calc.calcularImc(67, 1,67, 16, "m"));
	}
	
	@test
	public void testeSobrepesoCriancaMenino16Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso Crianca Menino 16 anos", calc.calcularImc(76, 1,66, 16, "m"));
	}
	
	@test
	public void testeObesidadeCriancaMenino16Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Crianca Menino 16 anos", calc.calcularImc(77, 1,67, 16, "m"));
	}
	
	@test
	public void testeBaixoPesoCriancaMenino18Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso Criança Menino 18 anos", calc.calcularImc(52, 1.70, 18, "m"));
	}
	
	@test
	public void testePesoNormalCriancaMenino18Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal Crianca Menino 18 anos", calc.calcularImc(74, 1.70, 18, "m"));
	}
	
	@test
	public void testeSobrepesoCriancaMenino18Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso Crianca Menino 18 anos", calc.calcularImc(83, 1.70, 18, "m"));
	}
	
	@test
	public void testeObesidadeCriancaMenino18Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Crianca Menino 18 anos", calc.calcularImc(88, 1.70, 18, "m"));
	}
	
	// Crianças Meninas
	
	@test
	public void testeBaixoPesoCriancaMenina2Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso Criança Menina 2 anos", calc.calcularImc(11, 0.86, 2, "f"));
	}
	
	@test
	public void testePesoNormalCriancaMenina2Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal Crianca Menina 2 anos", calc.calcularImc(13, 0.85, 2, "f"));
	}
	
	@test
	public void testeSobrepesoCriancaMenina2Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso Crianca Menina 2 anos", calc.calcularImc(14, 0.86, 2, "f"));
	}
	
	@test
	public void testeObesidadeCriancaMenina2Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Crianca Menina 2 anos", calc.calcularImc(14, 0.85, 2, "f"));
	}
	
	@test
	public void testeBaixoPesoCriancaMenina4Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso Criança Menina 4 anos", calc.calcularImc(15, 1.03, 4, "f"));
	}
	
	@test
	public void testePesoNormalCriancaMenina4Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal Crianca Menina 4 anos", calc.calcularImc(17, 1.02, 4, "f"));
	}
	
	@test
	public void testeSobrepesoCriancaMenina4Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso Crianca Menina 4 anos", calc.calcularImc(19, 1.03, 4, "f"));
	}
	
	@test
	public void testeObesidadeCriancaMenino4Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Crianca Menina 4 anos", calc.calcularImc(20, 1.04, 4, "f"));
	}
	
	@test
	public void testeBaixoPesoCriancaMenina6Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso Criança Menina 6 anos", calc.calcularImc(17, 1.14, 6, "f"));
	}
	
	@test
	public void testePesoNormalCriancaMenina6Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal Crianca Menina 6 anos", calc.calcularImc(22, 1.13, 6, "f"));
	}
	
	@test
	public void testeSobrepesoCriancaMenina6Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso Crianca Menina 6 anos", calc.calcularImc(24, 1.13, 6, "f"));
	}
	
	@test
	public void testeObesidadeCriancaMenina6Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Crianca Menina 6 anos", calc.calcularImc(25, 1.13, 6, "f"));
	}
	
	@test
	public void testeBaixoPesoCriancaMenina8Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso Criança Menina 8 anos", calc.calcularImc(22, 1,26, 8, "f"));
	}
	
	@test
	public void testePesoNormalCriancaMenina8Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal Crianca Menina 8 anos", calc.calcularImc(22, 1,25, 8, "f"));
	}
	
	@test
	public void testeSobrepesoCriancaMenina8Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso Crianca Menina 8 anos", calc.calcularImc(32, 1,25, 8, "f"));
	}
	
	@test
	public void testeObesidadeCriancaMenina8Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Crianca Menina 8 anos", calc.calcularImc(34, 1,25, 8, "f"));
	}
	
	@test
	public void testeBaixoPesoCriancaMenina10Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso Criança Menina 10 anos", calc.calcularImc(26, 1.37, 10, "f"));
	}
	
	@test
	public void testePesoNormalCriancaMenina10Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal Crianca Menina 10 anos", calc.calcularImc(36, 1.37, 10, "f"));
	}
	
	@test
	public void testeSobrepesoCriancaMenina10Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso Crianca Menina 10 anos", calc.calcularImc(43, 1.37, 10, "f"));
	}
	
	@test
	public void testeObesidadeCriancaMenina10Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Crianca Menina 10 anos", calc.calcularImc(46, 1.37, 10, "f"));
	}
	
	@test
	public void testeBaixoPesoCriancaMenina12Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso Criança Menina 12 anos", calc.calcularImc(32, 1.48, 12, "f"));
	}
	
	@test
	public void testePesoNormalCriancaMenina12Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal Crianca Menina 12 anos", calc.calcularImc(37, 1.49, 12, "f"));
	}
	
	@test
	public void testeSobrepesoCriancaMenina12Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso Crianca Menina 12 anos", calc.calcularImc(55, 1.49, 12, "f"));
	}
	
	@test
	public void testeObesidadeCriancaMenina12Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Crianca Menina 12 anos", calc.calcularImc(59, 1.48, 12, "f"));
	}
	
	@test
	public void testeBaixoPesoCriancaMenina14Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso Criança Menina 14 anos", calc.calcularImc(39, 1.58, 14, "f"));
	}
	
	@test
	public void testePesoNormalCriancaMenina14Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal Crianca Menina 14 anos", calc.calcularImc(58, 1.58, 14, "f"));
	}
	
	@test
	public void testeSobrepesoCriancaMenina14Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso Crianca Menina 14 anos", calc.calcularImc(66, 1.58, 14, "f"));
	}
	
	@test
	public void testeObesidadeCriancaMenina14Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Crianca Menina 14 anos", calc.calcularImc(67, 1.58, 14, "f"));
	}
	
	@test
	public void testeBaixoPesoCriancaMenina16Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso Criança Menina 16 anos", calc.calcularImc(43, 1,60, 16, "f"));
	}
	
	@test
	public void testePesoNormalCriancaMenina16Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal Crianca Menina 16 anos", calc.calcularImc(62, 1,61, 16, "f"));
	}
	
	@test
	public void testeSobrepesoCriancaMenina16Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso Crianca Menina 16 anos", calc.calcularImc(74, 1,61, 16, "f"));
	}
	
	@test
	public void testeObesidadeCriancaMenina16Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Crianca Menina 16 anos", calc.calcularImc(74, 1,60, 16, "f"));
	}
	
	@test
	public void testeBaixoPesoCriancaMenina18Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso Criança Menina 18 anos", calc.calcularImc(47, 1,65, 18, "f"));
	}
	
	@test
	public void testePesoNormalCriancaMenina18Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal Crianca Menina 18 anos", calc.calcularImc(72, 1,65, 18, "f"));
	}
	
	@test
	public void testeSobrepesoCriancaMenina18Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso Crianca Menina 18 anos", calc.calcularImc(82, 1,65, 18, "f"));
	}
	
	@test
	public void testeObesidadeCriancaMenina18Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Crianca Menina 18 anos", calc.calcularImc(87, 1,65, 18, "f"));
	}
	
}