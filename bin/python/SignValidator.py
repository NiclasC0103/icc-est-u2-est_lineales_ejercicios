class SignValidator:

    def is_valid(self, signos: str) -> bool:
        stack = []

        for character in signos:
            # character -> {
            # character -> }
            # 1 --> Comprobar si es de apertura o cierre
            if self.is_apertura(character):
                stack.append(character)
            else:
                if len(stack) == 0:
                    return False

                ultimo = stack.pop()
                # ultimo es del mismo tipo que character?
                mismo_tipo = self.is_tipo_igual(character, ultimo)

                if mismo_tipo is False:
                    return False

        return len(stack) == 0

    def is_apertura(self, c: str) -> bool:
        return c == '{' or c == '(' or c == '['

    def is_tipo_igual(self, c: str, ultimo: str) -> bool:
        return (c == ')' and ultimo == '(') or \
               (c == '}' and ultimo == '{') or \
               (c == ']' and ultimo == '[')
