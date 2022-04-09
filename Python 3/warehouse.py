# OOP in Python is strange

def run():
    for i in range(int(input())):
        shipments = []
        for j in range(int(input())):
            line = input().split()
            shipment = Shipment(line[0], int(line[1]))

            if shipment in shipments:
                for k in shipments:
                    if k == shipment:
                        k.addcount(shipment.count)
            else:
                shipments.append(shipment)

        shipments.sort()

        print(len(shipments))
        for s in shipments:
            print(s)


class Shipment:
    def __init__(self, toy, count):
        self.toy = toy
        self.count = count

    def addcount(self, count):
        self.count += count

    def __eq__(self, other):
        if not isinstance(other, Shipment):
            return NotImplemented

        return self.toy == other.toy

    def __repr__(self):
        return f'{self.toy} {self.count}'

    def __lt__(self, other):
        if self.count == other.count:
            return self.toy < other.toy

        return self.count > other.count


if __name__ == '__main__':
    run()
