
class Subscription:
    def __init__(self, name, prices):
        self.name = name
        self.prices = prices

    def total(self):
        return sum(self.prices)

subs = [Subscription("TOI", (3, 3, 3, 3, 3, 5, 6)),
            Subscription("Hindu", (2.5, 2.5, 2.5, 2.5, 2.5, 4, 4)),
            Subscription("ET", (4, 4, 4, 4, 4, 4, 10)),
            Subscription("BM", (1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5)),
            Subscription("HT", (2, 2, 2, 2, 2, 4, 4))]

def solve(subs, budget):
    amount = [s.total() for s in subs]
    comb = set()

    for i in range(2 ** len(subs)):
        ts, l = 0, []
        for j, b in enumerate(bin(i)[2:].zfill(5)):
            ts += (amount[j] * int(b))
            if int(b) == 1:
                l.append(subs[j].name)

        if ts <= budget and len(l) > 1:
            comb.add(tuple(l))
    
    return comb

budget = int(input("Enter your budget: "))
print(solve(subs, budget))
