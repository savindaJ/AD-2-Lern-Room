/**
 * @author : savindaJ
 * @date : 2024-05-18
 * @since : 0.1.0
 **/
public class Test {

    private final MetaDataMasterRepository metaDataMasterRepository;

    private final ModelMapper modelMapper;

    private static final Logger logger = LoggerFactory.getLogger(MetaDataMasterService.class);

    public MetaDataMasterService(MetaDataMasterRepository metaDataMasterRepository, ModelMapper modelMapper) {
        this.metaDataMasterRepository = metaDataMasterRepository;
        this.modelMapper = modelMapper;
    }

    public ResponseDTO getAllMetaData(String status) {
        try {
            HashMap<String, Object> map = new HashMap<>();
            List<MasterMetaDataDTO> list;

            if (status.equalsIgnoreCase("ALL")) {
                list = metaDataMasterRepository.findAll().stream().map(metaDataMaster -> modelMapper.map(metaDataMaster, MasterMetaDataDTO.class)).toList();
            } else if (status.equalsIgnoreCase("ACTIVE")) {
                list = metaDataMasterRepository.findByIsActive(true).stream().map(metaDataMaster -> modelMapper.map(metaDataMaster, MasterMetaDataDTO.class)).toList();
            } else {
                logger.error("Meta data masters not found");
                return new ResponseDTO("Meta data masters not found", 404);
            }
            map.put("meta data", list);

            logger.info("Meta data masters found successfully");
            return new ResponseDTO("Meta data masters found successfully", 200, map);
        } catch (Exception e) {
            logger.error("Error in finding subscription plans", e);
            return new ResponseDTO("Meta data masters not found", 404);
        }
    }
}
