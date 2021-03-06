def run():
    newlanguage = {
        'a': '@',
        'b': '8',
        'c': '(',
        'd': '|)',
        'e': '3',
        'f': '#',
        'g': '6',
        'h': '[-]',
        'i': '|',
        'j': '_|',
        'k': '|<',
        'l': '1',
        'm': '[]\/[]',
        'n': '[]\[]',
        'o': '0',
        'p': '|D',
        'q': '(,)',
        'r': '|Z',
        's': '$',
        't': '\'][\'',
        'u': '|_|',
        'v': '\/',
        'w': '\/\/',
        'x': '}{',
        'y': '`/',
        'z': '2'
    }

    line = input().lower()
    result = ''

    for char in line:
        if char.isalpha():
            result += newlanguage.get(char)
        else:
            result += char


    print(result)

if __name__ == '__main__':
    run()
