
// ********RoostGPT********
/*
Test generated by RoostGPT for test vertexxx using AI Type Vertex AI and AI Model code-bison

ROOST_METHOD_HASH=ordenarHashMapPorValor_0584e2ef74
ROOST_METHOD_SIG_HASH=ordenarHashMapPorValor_afd4884fe1

 **Scenario 1: Ordenar HashMap com Valores Positivos**

**TestName**: ordenarHashMapPorValorComValoresPositivos

**Description**: Testa se o método ordena corretamente um HashMap com valores positivos.

**Execution**:
- Arrange: Crie um HashMap com valores positivos, por exemplo: { "chave1": 10, "chave2": 5, "chave3": 20 }.
- Act: Chame o método ordenaHashMapPorValor com o HashMap criado.
- Assert: Verifique se o HashMap retornado está ordenado em ordem decrescente de valores, por exemplo: { "chave3": 20, "chave1": 10, "chave2": 5 }.

**Validation**:
- A asserção verifica se o HashMap retornado está ordenado corretamente em ordem decrescente de valores.
- Este teste é importante para garantir que o método ordena corretamente HashMaps com valores positivos.

**Scenario 2: Ordenar HashMap com Valores Negativos**

**TestName**: ordenarHashMapPorValorComValoresNegativos

**Description**: Testa se o método ordena corretamente um HashMap com valores negativos.

**Execution**:
- Arrange: Crie um HashMap com valores negativos, por exemplo: { "chave1": -10, "chave2": -5, "chave3": -20 }.
- Act: Chame o método ordenaHashMapPorValor com o HashMap criado.
- Assert: Verifique se o HashMap retornado está ordenado em ordem decrescente de valores, por exemplo: { "chave3": -20, "chave1": -10, "chave2": -5 }.

**Validation**:
- A asserção verifica se o HashMap retornado está ordenado corretamente em ordem decrescente de valores.
- Este teste é importante para garantir que o método ordena corretamente HashMaps com valores negativos.

**Scenario 3: Ordenar HashMap com Valores Mistos**

**TestName**: ordenarHashMapPorValorComValoresMistos

**Description**: Testa se o método ordena corretamente um HashMap com valores mistos, positivos e negativos.

**Execution**:
- Arrange: Crie um HashMap com valores mistos, por exemplo: { "chave1": 10, "chave2": -5, "chave3": 20 }.
- Act: Chame o método ordenaHashMapPorValor com o HashMap criado.
- Assert: Verifique se o HashMap retornado está ordenado em ordem decrescente de valores, por exemplo: { "chave3": 20, "chave1": 10, "chave2": -5 }.

**Validation**:
- A asserção verifica se o HashMap retornado está ordenado corretamente em ordem decrescente de valores.
- Este teste é importante para garantir que o método ordena corretamente HashMaps com valores mistos.

**Scenario 4: Ordenar HashMap Vazio**

**TestName**: ordenarHashMapPorValorComHashMapVazio

**Description**: Testa se o método ordena corretamente um HashMap vazio.

**Execution**:
- Arrange: Crie um HashMap vazio, por exemplo: {}.
- Act: Chame o método ordenaHashMapPorValor com o HashMap criado.
- Assert: Verifique se o HashMap retornado está vazio.

**Validation**:
- A asserção verifica se o HashMap retornado está vazio.
- Este teste é importante para garantir que o método ordena corretamente HashMaps vazios.

**Scenario 5: Ordenar HashMap Nulo**

**TestName**: ordenarHashMapPorValorComHashMapNulo

**Description**: Testa se o método ordena corretamente um HashMap nulo.

**Execution**:
- Arrange: Crie um HashMap nulo, por exemplo: null.
- Act: Chame o método ordenaHashMapPorValor com o HashMap criado.
- Assert: Verifique se o HashMap retornado é nulo.

**Validation**:
- A asserção verifica se o HashMap retornado é nulo.
- Este teste é importante para garantir que o método ordena corretamente HashMaps nulos.
*/

// ********RoostGPT********

package com.medeiros.SPRINGProject.utils;

import org.junit.jupiter.api.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class HashMapFunctionsOrdenarHashMapPorValorTest {

	@Test
	@Tag("valid")
	@DisplayName("Ordenar HashMap com Valores Positivos")
	void ordenarHashMapPorValorComValoresPositivos() {
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("chave1", 10);
		hashMap.put("chave2", 5);
		hashMap.put("chave3", 20);
		HashMap<String, Integer> sortedHashMap = hashMapFunctions.ordenarHashMapPorValor(hashMap);
		Map<String, Integer> expectedHashMap = new LinkedHashMap<>();
		expectedHashMap.put("chave3", 20);
		expectedHashMap.put("chave1", 10);
		expectedHashMap.put("chave2", 5);
		assertEquals(expectedHashMap, sortedHashMap);
	}

	@Test
	@Tag("valid")
	@DisplayName("Ordenar HashMap com Valores Negativos")
	void ordenarHashMapPorValorComValoresNegativos() {
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("chave1", -10);
		hashMap.put("chave2", -5);
		hashMap.put("chave3", -20);
		HashMap<String, Integer> sortedHashMap = hashMapFunctions.ordenarHashMapPorValor(hashMap);
		Map<String, Integer> expectedHashMap = new LinkedHashMap<>();
		expectedHashMap.put("chave3", -20);
		expectedHashMap.put("chave1", -10);
		expectedHashMap.put("chave2", -5);
		assertEquals(expectedHashMap, sortedHashMap);
	}

	@Test
	@Tag("valid")
	@DisplayName("Ordenar HashMap com Valores Mistos")
	void ordenarHashMapPorValorComValoresMistos() {
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("chave1", 10);
		hashMap.put("chave2", -5);
		hashMap.put("chave3", 20);
		HashMap<String, Integer> sortedHashMap = hashMapFunctions.ordenarHashMapPorValor(hashMap);
		Map<String, Integer> expectedHashMap = new LinkedHashMap<>();
		expectedHashMap.put("chave3", 20);
		expectedHashMap.put("chave1", 10);
		expectedHashMap.put("chave2", -5);
		assertEquals(expectedHashMap, sortedHashMap);
	}

	@Test
	@Tag("valid")
	@DisplayName("Ordenar HashMap Vazio")
	void ordenarHashMapPorValorComHashMapVazio() {
		HashMap<String, Integer> hashMap = new HashMap<>();
		HashMap<String, Integer> sortedHashMap = hashMapFunctions.ordenarHashMapPorValor(hashMap);
		Map<String, Integer> expectedHashMap = new LinkedHashMap<>();
		assertEquals(expectedHashMap, sortedHashMap);
	}

	@Test
	@Tag("valid")
	@DisplayName("Ordenar HashMap Nulo")
	void ordenarHashMapPorValorComHashMapNulo() {
		HashMap<String, Integer> hashMap = null;
		HashMap<String, Integer> sortedHashMap = hashMapFunctions.ordenarHashMapPorValor(hashMap);
		assertNull(sortedHashMap);
	}

}