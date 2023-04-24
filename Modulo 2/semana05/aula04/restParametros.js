function municipiosDaUf(uf, ...municipios) {
    municipios.forEach(municipio => console.log(`${municipio} - ${uf}`));
}

municipiosDaUf("SP", "São Caetano", "Guarulhos", "Diadema");
