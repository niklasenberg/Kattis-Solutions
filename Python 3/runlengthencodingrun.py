def run():
    line = input().split()

    if line[0] == 'E':
        print(encode(line[1]))
    else:
        print(decode(line[1]))


def encode(line):
    result = []
    count = 0
    character = ''

    for char in line:
        if character == '' or char == character:
            character = char
            count += 1
        else:
            result.append(f'{character}{count}')
            character = char
            count = 1

    result.append(f'{character}{count}')

    return ''.join(result)


def decode(line):
    result = []
    character = ''
    for char in line:
        if char.isdigit():
            result.append(f'{character}' * int(char))
        else:
            character = char

    return ''.join(result)


if __name__ == '__main__':
    run()
