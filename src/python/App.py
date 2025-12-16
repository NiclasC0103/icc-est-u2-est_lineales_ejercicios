from SignValidator import SignValidator


def run_sign_validator():
    validator = SignValidator()

    cadena1 = "{[()]}"   # VÁLIDO
    cadena2 = "{[(])}"   # NO VÁLIDO
    cadena3 = "([]){}"   # VÁLIDO

    print("=== Ejercicio: Validación de Signos ===")
    print(f"Cadena: {cadena1} es válida? {validator.is_valid(cadena1)}")
    print(f"Cadena: {cadena2} es válida? {validator.is_valid(cadena2)}")
    print(f"Cadena: {cadena3} es válida? {validator.is_valid(cadena3)}")


if __name__ == "__main__":
    run_sign_validator()
