const funcCardList = (card, action) => {
    return `
        <tr>
            <td class="px-6 py-4 whitespace-nowrap">
                <div class="flex items-center">
                    <div class="ml-4 text-sm font-medium text-gray-900">
                        ${card.id}
                    </div>
                </div>
            </td>
            <td class="px-6 py-4 whitespace-nowrap">
                <div class="flex items-center">
                    <div class="ml-4 text-sm font-medium text-gray-900">
                        ${card.title}
                    </div>
                </div>
            </td>
            <td class="px-6 py-4 whitespace-nowrap">
                <div class="text-sm text-gray-900">${card.description}</div>
            </td>
            <td class="px-6 py-4 whitespace-nowrap text-sm text-gray-500">
                ${card.family.name}
            </td>
            <td class="px-6 py-4 whitespace-nowrap">
                <div id="type" class="px-2 inline-flex text-xs leading-5 font-semibold rounded-full text-white ${card.type.color}">
                    ${card.type.name}
                </div>
            </td>
            <td class="px-6 py-4 whitespace-nowrap">
                <div class="text-sm text-gray-900">${card.healthPoint} HP</div>
            </td>
            <td class="px-6 py-4 whitespace-nowrap">
                <div class="text-sm text-gray-900">${card.price} €</div>
            </td>`+getActionButton(card, action)+`
        </tr>
    `
};

function getActionButton(card, action) {
    switch (action) {
        case 'sell':
            return `<td class="px-6 py-4 whitespace-nowrap text-right text-sm font-medium">
                       <a href="#" class="text-indigo-600 hover:text-indigo-900" onclick="sellCard('${card.id}')">Vendre</a>
                    </td>`;
        case 'buy':
            return `<td class="px-6 py-4 whitespace-nowrap text-right text-sm font-medium">
                        <a href="#" class="text-indigo-600 hover:text-indigo-900" onclick="buyCard('${card.id}')">Acheter</a>
                    </td>`;
    }
}